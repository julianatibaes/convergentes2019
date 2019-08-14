package edu.up.bsi.conv.soap.server;

public class Item {

	private int quantidade;
	private String descricao;
	
	public Item() {
		
	}
	public Item(int quantidade, String descricao) {
		setQuantidade(quantidade);
		setDescricao(descricao);
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return "Quantidade =" + quantidade + " e descricao=" + descricao + ".";
	}
	
	
}
