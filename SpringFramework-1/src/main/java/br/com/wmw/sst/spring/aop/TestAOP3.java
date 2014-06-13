package br.com.wmw.sst.spring.aop;

import br.com.wmw.spring.domain.Cliente;

public class TestAOP3 {

	public void executeTest() {
		Cliente cliente = new Cliente(1, "João da Silva");
		System.out.println(cliente.toString());
	}

}
