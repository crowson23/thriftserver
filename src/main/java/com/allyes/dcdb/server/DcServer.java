package com.allyes.dcdb.server;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TNonblockingServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TServerSocket;

import dc.thrift.generated.DcDbService;


public class DcServer {
	
	public static final int SERVER_PORT = 8090;
	
	// 简单的单线程服务模型，一般用于测试
		public void startSimpleServer() {
			try {
				System.out.println("DcServer TSimpleServer start ....");

				TProcessor tprocessor = new DcDbService.Processor<DcDbService.Iface>(new DcImpl());
				// HelloWorldService.Processor&lt;HelloWorldService.Iface&gt;
				// tprocessor =
				// new HelloWorldService.Processor&lt;HelloWorldService.Iface&gt;(
				// new HelloWorldImpl());

				// 简单的单线程服务模型，一般用于测试
				TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
				TServer.Args tArgs = new TServer.Args(serverTransport);
				tArgs.processor(tprocessor);
				tArgs.protocolFactory(new TBinaryProtocol.Factory());
				// tArgs.protocolFactory(new TCompactProtocol.Factory());
				// tArgs.protocolFactory(new TJSONProtocol.Factory());
				TServer server = new TSimpleServer(tArgs);
				server.serve();

				
			} catch (Exception e) {
				System.out.println("Server start error!!!");
				e.printStackTrace();
			}
		}

		// 线程池服务模型，使用标准的阻塞式IO，预先创建一组线程处理请求。
		public void startBlockingServer() {
			try {
				System.out.println("DcServer TThreadPoolServer start ....");

				TProcessor tprocessor = new DcDbService.Processor<DcDbService.Iface>(new DcImpl());

				TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
				TThreadPoolServer.Args ttpsArgs = new TThreadPoolServer.Args(serverTransport);
				ttpsArgs.processor(tprocessor);
				ttpsArgs.protocolFactory(new TBinaryProtocol.Factory());

				// 线程池服务模型，使用标准的阻塞式IO，预先创建一组线程处理请求。
				TServer server = new TThreadPoolServer(ttpsArgs);
				server.serve();

			} catch (Exception e) {
				System.out.println("Server start error!!!");
				e.printStackTrace();
			}
		}

		// 使用非阻塞式IO，服务端和客户端需要指定TFramedTransport数据传输的方式
		public void startNonblockingServer() {
			try {
				System.out.println("DcServer TNonblockingServer start ....");

				TProcessor tprocessor = new DcDbService.Processor<DcDbService.Iface>(new DcImpl());

				TNonblockingServerSocket tnbSocketTransport = new TNonblockingServerSocket(SERVER_PORT);
				TNonblockingServer.Args tnbArgs = new TNonblockingServer.Args(tnbSocketTransport);
				tnbArgs.processor(tprocessor);
				tnbArgs.transportFactory(new TFramedTransport.Factory());
				tnbArgs.protocolFactory(new TCompactProtocol.Factory());

				// 使用非阻塞式IO，服务端和客户端需要指定TFramedTransport数据传输的方式
				TServer server = new TNonblockingServer(tnbArgs);
				server.serve();

			} catch (Exception e) {
				System.out.println("Server start error!!!");
				e.printStackTrace();
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DcServer server = new DcServer();
		server.startNonblockingServer();
	}

}
