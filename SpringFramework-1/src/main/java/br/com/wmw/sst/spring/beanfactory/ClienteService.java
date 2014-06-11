/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework.beanFactory;

import br.com.wmw.sst.springframework.mock.annotation.GerenciamentoSpring;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard
 */
@GerenciamentoSpring
public class ClienteService {
    
    public void insert() {
        System.out.println("Cliente inserido com sucesso!");
    }
    
    public void update() {
        System.out.println("Cliente atualizado com sucesso!");
    }
    
    public List<String> findAll() {
        List<String> clientes = new ArrayList<>();
        clientes.add("Fulano");
        clientes.add("Ciclano");
        clientes.add("Beltrano");
        return clientes;
    }
    
}
