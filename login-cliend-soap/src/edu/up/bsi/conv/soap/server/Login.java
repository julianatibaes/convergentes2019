
package edu.up.bsi.conv.soap.server;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Login", targetNamespace = "http://server.soap.conv.bsi.up.edu/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Login {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.soap.conv.bsi.up.edu/Login/getMessageLoginRequest", output = "http://server.soap.conv.bsi.up.edu/Login/getMessageLoginResponse")
    public String getMessageLogin();

}
