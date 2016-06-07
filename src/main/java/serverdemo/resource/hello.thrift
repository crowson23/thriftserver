namespace java serverdemo.thriftserver

service  HelloWorldService {
  string sayHello(1:string username)
}