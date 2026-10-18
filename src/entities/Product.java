package entities;

import java.math.BigDecimal;

public class Product {
	private int id;
	private String nome;
	private BigDecimal preco;
	private int estoque;
	
	public Product(int id, String nome, BigDecimal preco, int estoque) {

		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	
}
