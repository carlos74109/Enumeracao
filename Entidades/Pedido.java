package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	
	List<ItemPedido> itens = new ArrayList<>();
	ItemPedido pedido;
	
	
	public void addItem(ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double total() {
		double soma = 0;
		for (ItemPedido itemPedido : itens) {
			soma += itemPedido.subTotal();
		}
		
		return soma;
	}

	
	public void exibir() {
		for (ItemPedido itemPedido : itens) {
			System.out.println("Nome do produto: " + itemPedido.getNome());
			System.out.println("quantidade: " + itemPedido.getQuantidade());
			System.out.println("o sub total: " + itemPedido.subTotal());
			System.out.println("-----------------------");
		}
	}
}	
