package edu.up.bsi.conv.soap.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/***
 *  Classe de que disponibiliza os métodos do servidor
 * 
 * @author Juliana Tibães
 *
 */

@WebService // informa que a classe é um web service
public class EstoqueWS {

	private ItemDAOFake dao = new ItemDAOFake();
	
	/*
	 * @WebMethod
	 * Marca o método como uma operação exposta pelo web service
	 * Permite personalizar o nome da operação publicada
	 *
	 * @WebResult
	 * Anotação para manipular o retorno
	 * 
	 * @WebParam
	 * Serve para informar os dados sobre o parâmetro do método do ws
	 * Não é obriatório, porém deixa mais explícito o que será requisitado (e mais elegante)
	 */
	
	@WebMethod(operationName = "todos_itens")
	@WebResult(name = "todos_itens_resultado")
	public ListaItens getAll() {
		return new ListaItens(dao.getAllItens());
	}
	
	@WebMethod(operationName = "calcula_frete_fake")
	@WebResult(name = "calcula_frete_fake_resultado")
	public String calculaFrete(@WebParam(name = "cep") int cep) {
		int calculadora = cep;
		String mensagem = "Seu frete será R$ 34,00 para o CEP " + calculadora;
		return mensagem;
	}

}
