package br.com.wmw.sst.spring.aop;

import java.util.Date;

import br.com.wmw.spring.domain.AbstractDomain;
import br.com.wmw.sst.spring.domain.Cliente;

public class TestAOP2 {

	public void executeTest() {
		Cliente cliente = new Cliente(1, "Jo�o da Silva");

		beforePrint(cliente);

		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			//n�o faz nada
		}

		cliente.setFlImpresso("S");
		String className = "[" + cliente.getClass().getSimpleName()+"] ";

		System.out.println(className + cliente.toString());

		afterPrint(cliente);
	}

	private void beforePrint(Object o) {
		AbstractDomain domain = (AbstractDomain) o;
		String log = String.format("[%s] iniciando m�todo... (Impresso: %s)", new Date(), domain.getFlImpresso());
		System.out.println(log);
	}

	private void afterPrint(Object o) {
		AbstractDomain domain = (AbstractDomain) o;
		String log = String.format("[%s] finalizado m�todo... (Impresso: %s)", new Date(), domain.getFlImpresso());
		System.out.println(log);
	}

}
