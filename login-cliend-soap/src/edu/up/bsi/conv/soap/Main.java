package edu.up.bsi.conv.soap;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;
import javax.xml.ws.handler.MessageContext;

import edu.up.bsi.conv.soap.server.Login;


public class Main {

	private static final String WS_URL = "http://localhost:9000/login?wsdl";
	 
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL(WS_URL);
	    QName qname = new QName(
	         "http://server.soap.conv.bsi.up.edu/",
	         "HelloWorldImpService");
	
	     Service service = Service.create(url, qname);
	     Login login = service.getPort(Login.class);
	
	     BindingProvider provider = (BindingProvider) login;
	     
	     Map<String, Object> req_ctx = provider.getRequestContext();
	     req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, WS_URL);
	
	     Map<String, List<String>> headers = new HashMap<String, List<String>>();
	     headers.put("Username", Collections.singletonList("admin"));
	     headers.put("Password",Collections.singletonList("admin123"));
	     
	     req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
	
	     System.out.println(login.getMessageLogin());
	
	}
	
}
