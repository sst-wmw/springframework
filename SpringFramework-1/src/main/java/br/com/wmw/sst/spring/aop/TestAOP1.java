package br.com.wmw.sst.spring.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.wmw.sst.spring.domain.Cliente;

public class TestAOP1 {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	public void executeTest() {
		Cliente cliente = new Cliente(1, "João da Silva");

		// Log no início do método
		String logInicio = String.format("[%s] iniciando método... (Impresso: %s)", dateFormat.format(new Date()), cliente.getFlImpresso());
		System.out.println(logInicio);

		// Executando thread
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			//não faz nada
		}

		String className = "[" + cliente.getClass().getSimpleName()+"] ";
		System.out.println(className + cliente.toString());
		cliente.setFlImpresso("S");

		//Log no fim no método
		String logFim = String.format("[%s] finalizado método... (Impresso: %s)", dateFormat.format(new Date()), cliente.getFlImpresso());
		System.out.println(logFim);
	}

}
