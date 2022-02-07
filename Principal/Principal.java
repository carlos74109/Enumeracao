package Principal;

import java.util.Scanner;

import Entidades.Cliente;
import Entidades.ItemPedido;
import Entidades.Pedido;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nome: ");
		String nome = sc.next();
		
		System.out.println("Email: ");
		String email = sc.next();
		
		System.out.println("Quantos produtos? ");
		Integer qtde = sc.nextInt();
		
		Cliente cliente = new Cliente(nome, email);
		Pedido pedido = new Pedido();
		
		for(int i =0; i < qtde; i++) {
			System.out.println("Nome do produto " + (i +1)+": ");
			String nomeProd = sc.next();
			
			System.out.println("Preco do produto "+(i+1)+": ");
			Double precoProd = sc.nextDouble();
			
			System.out.println("Quantidade "+(i+1)+": ");
			Integer quantidade = sc.nextInt();
			
			pedido.addItem(new ItemPedido(nomeProd, quantidade, precoProd));
			
		}
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Email: " + cliente.getEmail());
		pedido.exibir();
		System.out.println("Valor total: " + pedido.total());
		sc.close();
	}

}
