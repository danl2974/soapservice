package com.dl2974.soapws;

import javax.jws.WebService;

@WebService(endpointInterface="com.dl2974.soapws.ISoapService")
public class SoapServiceImpl implements ISoapService {
	
	 public String tester(String name) {
	  return "Tester Response: " + name;
	 }



}
