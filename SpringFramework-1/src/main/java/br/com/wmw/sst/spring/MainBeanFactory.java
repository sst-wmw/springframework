/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework;

import br.com.wmw.sst.springframework.beanFactory.ClienteService;
import br.com.wmw.sst.springframework.mock.BeanFactory;

/**
 *
 * @author Richard
 */
public class MainBeanFactory {
    
    public static void main(String[] args) throws Exception {
        
        ClienteService clienteService = (ClienteService) BeanFactory.getBean(ClienteService.class);
        clienteService.insert();
        clienteService.update();        
        
    }
    
}
