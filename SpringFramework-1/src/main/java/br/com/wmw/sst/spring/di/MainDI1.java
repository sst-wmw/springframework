package br.com.wmw.sst.spring.di;

import br.com.wmw.sst.spring.domain.Log;
import br.com.wmw.sst.spring.domain.Produto;


public class MainDI1 {

    public static void main(String[] args) {

    	// ===========================================
    	// Constructor Injection
    	// ===========================================

    	//Log
    	Log log = new Log("c:/logs/vendeProduto.txt");

    	//Produto
    	Produto produto = new Produto(2, "Whisky Johnnie Walker Red Label");

    	//Venda
    	VendaService vendaService = new VendaService(log);
    	vendaService.vendeProduto(produto);


    	// ===========================================
    	// Setters Injection
    	// ===========================================



    }

}
