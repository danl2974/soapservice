package com.dl2974.soapws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface ISoapService {

	
	@WebMethod
	public String power(@WebParam(name="number") String number);	
	
	@WebMethod
	public String tester(@WebParam(name="message") String name);
	
}

