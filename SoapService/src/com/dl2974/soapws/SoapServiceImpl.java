package com.dl2974.soapws;

import javax.jws.WebService;

import java.util.logging.Logger;

@WebService(endpointInterface="com.dl2974.soapws.ISoapService")
public class SoapServiceImpl implements ISoapService {
	
	 private static final Logger logger = Logger.getLogger(SoapServiceImpl.class.getName());
	
	 public String tester(String name) {
		 
	  return "Tester Response: " + name;
	  
	 }
	 
	 public String power(String number) {
		  
		  logger.info("Number SoapServiceImpl: " + number);
		  double result = Math.pow(Double.valueOf(number), 2.0);
		  
		  return String.valueOf(result);
		  
		 }	 
	 



}
