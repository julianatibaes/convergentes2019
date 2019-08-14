package edu.up.bsi.conv.soap.server;



import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/***
 *  Classe para definir  expor o seu elemento.
 * 
 * @author Juliana Tibães
 *
 */

@XmlRootElement // represena o elemento principal, ou a tag principal, do XML
@XmlAccessorType(XmlAccessType.FIELD) // define onde as anotações JAXB devem ser interpretadas, nos métodos ou atributos.
public class ListaItens {

	@XmlElement(name = "itens") // Representa uma tag dentro do XML
	private List<Item> itens;

	public ListaItens() {
	}
	public ListaItens(List<Item> itens) {
		setItens(itens);
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}
	
	/**
	 * Outras anotações recomendadas
	 * 
	 * @XmlAtribute
	 * Representa um atributo dentro de uma tag
	 * 
	 * @XmlElementWrapper
	 * Encapsula uma lista
	 */
	
}
