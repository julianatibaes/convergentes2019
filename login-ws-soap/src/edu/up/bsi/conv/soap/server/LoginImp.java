package edu.up.bsi.conv.soap.server;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService(endpointInterface = "edu.up.bsi.conv.soap.server.Login")
public class LoginImp implements Login{
	
	@Resource
	WebServiceContext wsctx;
	
	@Override
	public String getMessageLogin() {
		
		MessageContext mctx = wsctx.getMessageContext();
		  
        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List<String> userList = (List<String>) http_headers.get("Username");
        List<String> passList = (List<String>) http_headers.get("Password");
  
        String username = "";
        String password = "";
  
        if (userList != null) {
            username = userList.get(0);
        }
  
        if (passList != null) {
            password = passList.get(0);
  
        }
  
        if (username.equals("admin")
            &&
            password.equals("admin123")) {
            return "Olá "
                + username +
                " bem vindo ao login SOAP.";
        } else {
            return " Usuário inválido";
        }
	    
	}

}
