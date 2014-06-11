/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework.dependecyInjection;

/**
 *
 * @author Richard
 */
public class Musica {

    private String nmMusica;
    private Genero genero;
    
    public enum Genero {
        SERTANEJO,
        POP,
        POPROCK,
        ROCK,
        MPB        
    }
    
    public Musica(final String nmMusica, final Genero genero) {
        this.nmMusica = nmMusica;
        this.genero = genero;
    }
    
    
    
    public String getNmMusica() {
        return nmMusica;
    }

    public void setNmMusica(String nmMusica) {
        this.nmMusica = nmMusica;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return String.format("- %s / %s", nmMusica, genero.toString());
    }
    
    
}
