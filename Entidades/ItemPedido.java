package Entidades;

public class ItemPedido {
	
	private String nome;
	private Integer quantidade;
	private Double preco;
	

	public ItemPedido(String nome, Integer quantidade, Double preco) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public ItemPedido() {
		
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double subTotal() {
		return quantidade * preco;
	}
	
	
	
	
	
	
}
