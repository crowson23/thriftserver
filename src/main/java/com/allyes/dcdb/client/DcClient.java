package com.allyes.dcdb.client;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;


import dc.thrift.generated.DcDbService;
import dc.thrift.generated.RequestDeliverInfo;

public class DcClient {

	public static final String SERVER_IP = "10.200.39.100";
	//public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;
	
	public void startNonblockingClient(String userName) {
		try {
			TAsyncClientManager clientManager = new TAsyncClientManager();
			TNonblockingTransport transport = new TNonblockingSocket(SERVER_IP, SERVER_PORT, TIMEOUT);

			//TProtocolFactory tprotocol = new TCompactProtocol.Factory();
			TProtocolFactory tprotocol = new TBinaryProtocol.Factory();
			DcDbService.AsyncClient asyncClient = new DcDbService.AsyncClient(tprotocol, clientManager, transport);
			System.out.println("Client start .....");

			CountDownLatch latch = new CountDownLatch(1);
			AsynCallback callBack = new AsynCallback(latch);
			System.out.println("call method sayHello start ...");
			
			RequestDeliverInfo rqdi = new RequestDeliverInfo();
			List<RequestDeliverInfo> requestList = new ArrayList<RequestDeliverInfo>();
			requestList.add(rqdi);
			asyncClient.sendDeliverInfoList(requestList, Utils.ipStrToLong("255.255.255.255"), "ifc", callBack);
			
			System.out.println("call method sayHello .... end");
			boolean wait = latch.await(30, TimeUnit.SECONDS);
			System.out.println("latch.await = " + wait);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("startClient end.");
	}

	public class AsynCallback implements AsyncMethodCallback<DcDbService.AsyncClient.sendDeliverInfoList_call> {
		private CountDownLatch latch;

		public AsynCallback(CountDownLatch latch) {
			this.latch = latch;
		}

		public void onError(Exception exception) {
			System.out.println("onError :" + exception.getMessage());
			latch.countDown();
		}

		@Override
		public void onComplete(DcDbService.AsyncClient.sendDeliverInfoList_call call) {
			System.out.println("onComplete");
			try {
				// Thread.sleep(1000L * 1);
				System.out.println("AsynCall result = " + call.getResult());
				System.out.println("AsynCall result = " + call.getResult().getResponseDeliverInfoList().get(0).click);
			} catch (TException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				latch.countDown();
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DcClient client = new DcClient();
		client.startNonblockingClient("Michael");
	}
}
