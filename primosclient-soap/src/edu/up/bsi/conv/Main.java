package edu.up.bsi.conv;

import java.util.List;
import java.util.Scanner;

import edu.up.bsi.conv.soap.Calculadora;
import edu.up.bsi.conv.soap.CalculadoraService;
import edu.up.bsi.conv.soap.Numero;

public class Main {

	public static void main(String[] args) {
		
		Calculadora calculadora = new CalculadoraService().getCalculadoraPort();
		Numero numero = new Numero();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor inicial igual ou maior que zero: ");
		numero.setValorInicial(scanner.nextInt());
		
		System.out.println("Digite a quantidade de valores, maior que zero: ");
		numero.setQuantidade(scanner.nextInt());
		
		scanner.close();
		
		List<Integer> resultado = calculadora.achaPrimos(numero);
		System.out.println("Números primos:");
		for(Integer elemento: resultado) {
			System.out.println(elemento);
		}
	}

}
