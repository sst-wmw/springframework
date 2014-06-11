package br.com.wmw.spring.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.wmw.spring.domain.AbstractDomain;


public aspect ServiceAspectJ {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	pointcut tostr(Object obj) : execution(String toString()) && target(obj);


	// M�todo executado durante a execu��o do toString().
	// A chamada proceed(o) do m�todo � a chamada do m�todo toString() do objeto.
	// Demais linhas s�o complementos personalizados do m�todo.
	String around(Object o) : tostr(o) {
		AbstractDomain domain = (AbstractDomain) o;
		String s = proceed(o);
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			//n�o faz nada
		}
		String retorno = "[" + o.getClass().getSimpleName()+"] " + s;
		domain.setFlImpresso("S");
		return retorno;
	}

	// Executado antes do toString do objeto.
	before(Object o) : tostr(o) {
		AbstractDomain domain = (AbstractDomain) o;
		String log = String.format("[%s] iniciando m�todo... (Impresso: %s)", dateFormat.format(new Date()), domain.getFlImpresso());
		System.out.println(log);
	}

	// Executado ap�s o toString do objeto.
	after(Object o) : tostr(o) {
		AbstractDomain domain = (AbstractDomain) o;
		String log = String.format("[%s] finalizado m�todo... (Impresso: %s)", dateFormat.format(new Date()), domain.getFlImpresso());
		System.out.println(log);
	}

}
