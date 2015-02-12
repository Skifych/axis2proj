package com.test.ws.axis2proj;

import javax.jws.WebService;

@WebService
public interface HelloService {
	String getVersion();
	String hello(String name);
	String numericResult( int num);
}
