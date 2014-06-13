package br.com.wmw.sst.spring.aop;

import java.util.Date;

import br.com.wmw.sst.spring.domain.Cliente;

public class TestAOP1 {

	public void executeTest() {
		Cliente cliente = new Cliente(1, "João da Silva");

		// Log no início do método
		String logInicio = String.format("[%s] iniciando método... (Impresso: %s)", new Date(), cliente.getFlImpresso());
		System.out.println(logInicio);

		// Executando thread
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			//não faz nada
		}

		cliente.setFlImpresso("S");
		String className = "[" + cliente.getClass().getSimpleName()+"] ";

		System.out.println(className + cliente.toString());

		String logFim = String.format("[%s] finalizado método... (Impresso: %s)", new Date(), cliente.getFlImpresso());
		System.out.println(logFim);
	}

}
