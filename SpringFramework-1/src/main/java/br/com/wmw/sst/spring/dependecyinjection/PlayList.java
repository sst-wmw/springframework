/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.spring.dependecyinjection;

import java.util.List;

/**
 *
 * @author Richard
 */
public interface PlayList {

    public List<Musica> getMusicas();
    public void defineEqualizador(int grave, int medio, int agudo);
    public void vizualizarEqualizador();

}
