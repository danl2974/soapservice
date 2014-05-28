package com.dl2974.soapws;

import javax.jws.WebService;

@WebService(endpointInterface="com.dl2974.soapws.ISoapService")
public class SoapServiceImpl implements ISoapService {
	
	 public String tester(String name) {
		 
	  return "Tester Response: " + name;
	  
	 }
	 
	 public String power(String number) {
		 
		  double result = Math.pow(Double.valueOf(number), 2.0);
		  
		  return String.valueOf(result);
		  
		 }	 
	 



}
