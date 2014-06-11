package br.com.wmw.spring.aop;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.wmw.spring.domain.AbstractDomain;


public aspect ServiceAspectJ {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	pointcut tostr(Object obj) : execution(String toString()) && target(obj);


	// Método executado durante a execução do toString().
	// A chamada proceed(o) do método é a chamada do método toString() do objeto.
	// Demais linhas são complementos personalizados do método.
	String around(Object o) : tostr(o) {
		AbstractDomain domain = (AbstractDomain) o;
		String s = proceed(o);
		try {
			Thread.sleep(2000);
		} catch (Exception ex) {
			//não faz nada
		}
		String retorno = "[" + o.getClass().getSimpleName()+"] " + s;
		domain.setFlImpresso("S");
		return retorno;
	}

	// Executado antes do toString do objeto.
	before(Object o) : tostr(o) {
		AbstractDomain domain = (AbstractDomain) o;
		String log = String.format("[%s] iniciando método... (Impresso: %s)", dateFormat.format(new Date()), domain.getFlImpresso());
		System.out.println(log);
	}

	// Executado após o toString do objeto.
	after(Object o) : tostr(o) {
		AbstractDomain domain = (AbstractDomain) o;
		String log = String.format("[%s] finalizado método... (Impresso: %s)", dateFormat.format(new Date()), domain.getFlImpresso());
		System.out.println(log);
	}

}
