package edu.up.bsi.conv.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Numero {

	@XmlElement
	private int valorInicial;
	@XmlElement
	private int quantidade;
	
	public Numero() {
	}
	
	public Numero(int valorInicial, int quantidade) {
		setValorInicial(valorInicial);
		setQuantidade(quantidade);
	}
	
	public int getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}
