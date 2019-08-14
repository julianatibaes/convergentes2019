package edu.up.bsi.conv.soap.server;

import javax.xml.ws.Endpoint;

/***
 *  Classe de inicialização do sistema
 * 
 * @author Juliana Tibães
 *
 */

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/estoque", new EstoqueWS());
		System.out.println("Servidor aguardando conexões.");
	}

}
