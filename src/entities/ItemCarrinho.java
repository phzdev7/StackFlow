package entities;

import java.math.BigDecimal;

public class ItemCarrinho {
	private int idProduto;
	private String nomeProduto;
	private BigDecimal precoProduto;
	private int quantidadeProduto;
	
	
	
	public ItemCarrinho(int idProduto, String nomeProduto, BigDecimal precoProduto, int quantidadeProduto) {
	
		this.idProduto = idProduto;
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public BigDecimal getPrecoProduto() {
		return precoProduto;
	}
	public void setPrecoProducto(BigDecimal precoProduto) {
		this.precoProduto = precoProduto;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public void diminuirQuantidade() {
	    quantidadeProduto--;
	}
}
