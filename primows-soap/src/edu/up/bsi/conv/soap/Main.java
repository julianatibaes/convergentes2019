package edu.up.bsi.conv.soap;

import javax.xml.ws.Endpoint;

public class Main {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/primos", new Calculadora());
		System.out.println("Servidor aguardando conexões.");

	}

}
