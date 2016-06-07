package serverdemo.thriftserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TNonblockingTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import serverdemo.thriftserver.HelloWorldService.AsyncClient.sayHello_call;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
public class HelloClientDemo {

	public static final String SERVER_IP = "localhost";
	public static final int SERVER_PORT = 8090;
	public static final int TIMEOUT = 30000;

	/**
	 *
	 * @param userName
	 */
	public void startClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
			// 协议要和服务端一致
			TProtocol protocol = new TBinaryProtocol(transport);
			// TProtocol protocol = new TCompactProtocol(transport);
			// TProtocol protocol = new TJSONProtocol(transport);
			HelloWorldService.Client client = new HelloWorldService.Client(protocol);
			transport.open();
			String result = client.sayHello(userName);
			System.out.println("Thrify client result =: " + result);
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if (null != transport) {
				transport.close();
			}
		}
	}

	public void startNClient(String userName) {
		TTransport transport = null;
		try {
			transport = new TFramedTransport(new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT));
			// 协议要和服务端一致
			TProtocol protocol = new TCompactProtocol(transport);
			HelloWorldService.Client client = new HelloWorldService.Client(protocol);
			transport.open();
			String result = client.sayHello(userName);
			System.out.println("Thrify client result =: " + result);
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		} finally {
			if (null != transport) {
				transport.close();
			}
		}
	}

	public void startNonblockingClient(String userName) {
		try {
			TAsyncClientManager clientManager = new TAsyncClientManager();
			TNonblockingTransport transport = new TNonblockingSocket(SERVER_IP, SERVER_PORT, TIMEOUT);

			TProtocolFactory tprotocol = new TCompactProtocol.Factory();
			HelloWorldService.AsyncClient asyncClient = new HelloWorldService.AsyncClient(tprotocol, clientManager, transport);
			System.out.println("Client start .....");

			CountDownLatch latch = new CountDownLatch(1);
			AsynCallback callBack = new AsynCallback(latch);
			System.out.println("call method sayHello start ...");
			asyncClient.sayHello(userName, callBack);
			System.out.println("call method sayHello .... end");
			boolean wait = latch.await(30, TimeUnit.SECONDS);
			System.out.println("latch.await = " + wait);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("startClient end.");
	}

	public class AsynCallback implements AsyncMethodCallback<sayHello_call> {
		private CountDownLatch latch;

		public AsynCallback(CountDownLatch latch) {
			this.latch = latch;
		}

		public void onComplete(sayHello_call response) {
			System.out.println("onComplete");
			try {
				// Thread.sleep(1000L * 1);
				System.out.println("AsynCall result = " + response.getResult().toString());
			} catch (TException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				latch.countDown();
			}
		}

		public void onError(Exception exception) {
			System.out.println("onError :" + exception.getMessage());
			latch.countDown();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloClientDemo client = new HelloClientDemo();
		client.startNonblockingClient("Michael");

	}

}