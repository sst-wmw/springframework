package br.com.wmw.sst.spring;
import br.com.wmw.spring.domain.Cliente;
import br.com.wmw.spring.domain.Produto;


public class MainAOP {

	public static void main(String[] args) {

		Cliente cliente = new Cliente(1, "Richard Elias Constantino");
		System.out.println(cliente.toString());

		System.out.println();

		Produto produto = new Produto(1, "iPhone 5s", 2800d);
		System.out.println(produto.toString());

	}

}
