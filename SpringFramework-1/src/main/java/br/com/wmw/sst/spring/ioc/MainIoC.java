/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.spring.ioc;

import br.com.wmw.sst.spring.domain.Produto;


/**
 *
 * @author Richard
 */
public class MainIoC {

    public static void main(String[] args) throws Exception {

    	//Produto
    	Produto produto = new Produto(1, "Whisky Jack Daniel's");

    	//Venda
    	VendaService vendaService = new VendaService();
    	vendaService.vendeProduto(produto);

    }

}
