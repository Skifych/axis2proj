package com.test.ws.axis2proj;

public class HelloServiceImpl implements HelloService {

	public String getVersion() {
		// TODO Auto-generated method stub
		return "1.0";
	}

	public String hello(String name) {
		// TODO Auto-generated method stub
		return "name is " + name;
	}

	public String numericResult(int num) {
		// TODO Auto-generated method stub
		return "numeric is " + num;
	}

}
