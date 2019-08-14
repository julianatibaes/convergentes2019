package edu.up.bsi.conv.soap.server;

import java.util.ArrayList;
import java.util.List;

/***
 *  Classe para simular a conexão com o banco de dados
 * 
 * @author Juliana Tibães
 *
 */

public class ItemDAOFake {

	public List<Item> getAllItens() {
		List<Item> lista_itens = new  ArrayList<Item>();
		lista_itens.add(new Item(30, "Coca-cola"));
		lista_itens.add(new Item(32, "Fanta"));
		lista_itens.add(new Item(45, "Guaraná"));
		lista_itens.add(new Item(13, "Suco de laranja"));
		lista_itens.add(new Item(23, "Sprite"));
		
		return lista_itens;
				
	}
}
