package br.com.wmw.sst.spring.ioc;

import br.com.wmw.sst.spring.domain.Log;
import br.com.wmw.sst.spring.domain.Produto;

public class VendaService {

	public VendaService() {
		super();
	}

	public void vendeProduto(Produto produto) {

		// ...
		// Lógico venda do produto
		// ...
		System.out.println(String.format("Venda efetuada com sucesso. Produto: %s.", produto));


		//gera log após vender o produto
		Log log = new Log("c:/logs/vendeProduto.txt");
		String message = String.format("%s vendido com sucesso", produto);
	    log.geraLog(message);
	}

}
