package edu.up.bsi.conv.soap.server;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9000/login", new LoginImp());
		System.out.println("Servidor disponível.");

	}

}
