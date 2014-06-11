/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework.dependecyInjection;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard
 */
public class RockPlayList implements PlayList {
    
    private int grave;
    private int medio;
    private int agudo;

    @Override
    public List<Musica> getMusicas() {
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Toxicity [System of a Down", Musica.Genero.ROCK));
        musicas.add(new Musica("Abominável [CPM 22]", Musica.Genero.ROCK));
        musicas.add(new Musica("É Proibido Fumar [Skank]", Musica.Genero.POPROCK));
        return musicas;
    }

    @Override
    public void defineEqualizador(int grave, int medio, int agudo) {
        this.grave = grave;
        this.medio = medio;
        this.agudo = agudo;
    }

    @Override
    public void vizualizarEqualizador() {
        System.out.println("======= EQUALIZADOR =======");
        System.out.println(String.format("Grave: %s", grave));
        System.out.println(String.format("Médio: %s", medio));
        System.out.println(String.format("Agudo: %s", agudo));
    }
    
}
