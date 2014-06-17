package br.com.wmw.sst.spring.di;

import br.com.wmw.sst.spring.domain.Log;
import br.com.wmw.sst.spring.domain.Produto;

public class VendaService {

	private Log log;

	public VendaService() {
		super();
	}

	public VendaService(Log logVenda) {
		this.log = logVenda;
	}

	public void vendeProduto(Produto produto) {

		// ...
		// L�gico venda do produto
		// ...
		System.out.println(String.format("Venda efetuada com sucesso. Produto: %s.", produto));

		// Gera log ap�s vender o produto
		String message = String.format("%s vendido com sucesso", produto);
		log.geraLog(message);
	}

	public void setLog(final Log log) {
		this.log = log;
	}

}
