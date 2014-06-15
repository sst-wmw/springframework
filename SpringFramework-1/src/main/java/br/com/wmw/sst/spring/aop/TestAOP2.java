package br.com.wmw.sst.spring.aop;

import java.util.Date;

import br.com.wmw.sst.spring.domain.Cliente;

public class TestAOP2 {

	public void executeTest() {
		Cliente cliente = new Cliente(1, "João da Silva");

		//Executando método antes de imprimir
		beforePrint(cliente);

		// Executando thread
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			//não faz nada
		}

		String className = "[" + cliente.getClass().getSimpleName()+"] ";
		System.out.println(className + cliente.toString());
		cliente.setFlImpresso("S");

		//Executando método depois de imprimir
		afterPrint(cliente);
	}

	private void beforePrint(Cliente cliente) {
		String log = String.format("[%s] iniciando método... (Impresso: %s)", new Date(), cliente.getFlImpresso());
		System.out.println(log);
	}

	private void afterPrint(Cliente cliente) {
		String log = String.format("[%s] finalizado método... (Impresso: %s)", new Date(), cliente.getFlImpresso());
		System.out.println(log);
	}

}
