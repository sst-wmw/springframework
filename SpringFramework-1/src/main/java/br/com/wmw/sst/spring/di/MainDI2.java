package br.com.wmw.sst.spring.di;

import br.com.wmw.sst.spring.domain.Log;
import br.com.wmw.sst.spring.domain.Produto;


public class MainDI2 {

    public static void main(String[] args) {

    	// ===========================================
    	// Setters Injection
    	// ===========================================

    	Log log = new Log("c:/logs/vendeProduto.txt");

    	Produto produto = new Produto(2, "Whisky Johnnie Walker Red Label");

    	VendaService vendaService = new VendaService();
    	vendaService.setLog(log);
    	vendaService.vendeProduto(produto);

    }

}
