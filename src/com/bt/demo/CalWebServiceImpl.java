package com.bt.demo;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.bt.demo.service.CalService;

@WebService(endpointInterface = "com.bt.demo.CalWebService", portName = "CalWebServicePort", serviceName = "CalWebService")
public class CalWebServiceImpl implements CalWebService {

	@Autowired
	CalService calService;

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public String serviceName() {
		if (calService != null)
			return calService.serviceName();
		return "unsuccssful !! reply from webservice";
	}

}
