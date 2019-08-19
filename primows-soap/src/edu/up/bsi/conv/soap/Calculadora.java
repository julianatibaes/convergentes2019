package edu.up.bsi.conv.soap;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class Calculadora {

	@WebMethod(operationName = "acha_primos")
	@WebResult(name = "primos")
	public List<Integer> calcPrime(@WebParam(name = "numero") Numero numero){
		List<Integer> primos = new ArrayList<Integer>();
		int i = numero.getValorInicial();
		while (primos.size() < numero.getQuantidade()){
			if(isPrime(i) == true) {
				primos.add(i);
			}
			i++;
		}
		return primos;
	}
	
	private boolean isPrime(int number) {
		number = Math.abs(number);
		if (number >= 0 && number <= 2) {
			return true;
		} else if (number %2 == 0) {
			return false;
		} else {
			for (int i = 3; i * i <=number; i +=2) {
				if (number % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
