/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework.mock;

import br.com.wmw.sst.springframework.mock.annotation.GerenciamentoSpring;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Richard
 */
public class BeanFactory {
    
    private static Map<String, Object> cache = new HashMap<>();
    
    public static Object getBean(final Class clazz) throws Exception {
        if (clazz != null) {
            if (clazz.isAnnotationPresent(GerenciamentoSpring.class)) {
                Object value =  cache.get(clazz.getSimpleName());
                if (value != null) {
                    return value;
                } else {
                    value = clazz.newInstance();
                    cache.put(clazz.getSimpleName(), value);
                    return value;
                }
            } else {
                throw new Exception(String.format("A classe %s não é gerenciada pelo SpringMock", clazz.getSimpleName()));
            }
        } else {
            throw new Exception("Class enviada por parâmetro não pode ser nula.");
        }
    }
    
}
