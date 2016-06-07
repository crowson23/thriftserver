package serverdemo.thriftserver;

import org.apache.thrift.TException;

/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 *
 */
public class HelloWorldImpl implements HelloWorldService.Iface {

	public HelloWorldImpl() {
	}

	public String sayHello(String username) throws TException {
		return "Hi," + username + " welcome to my blog www.micmiu.com";
	}

}