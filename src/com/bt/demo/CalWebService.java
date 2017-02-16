package com.bt.demo;

import javax.jws.WebService;

@WebService
public interface CalWebService {
	int sum(int a, int b);

	String serviceName();
}
