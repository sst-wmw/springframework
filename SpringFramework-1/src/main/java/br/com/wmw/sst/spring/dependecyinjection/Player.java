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
public class Player {
    
    private PlayList playList;

    public Player() {
    }
    
    // Constructor Injection
    public Player(final PlayList playList) {
        this.playList = playList;
    }

    // Setter Injection
    public void setPlayList(final PlayList playList) {
        this.playList = playList;
    }

    public void setEqualizador(int grave, int medio, int agudo)  {
        if (this.playList != null) {
            this.playList.defineEqualizador(grave, medio, agudo);
        } else {
            System.out.println("PlayList não definida.");
        }
    }
    
    public void showEqualizador() {
        if (this.playList != null) {
            this.playList.vizualizarEqualizador();    
        } else {
            System.out.println("PlayList não definida.");    
        }
        
    }

    public void showMusicas() {
        if (this.playList != null) {
            System.out.println("========= MUSICAS =========");
            playList.getMusicas().stream().forEach((musica) -> {
                System.out.println(musica.toString());
            });
            System.out.println("===========================");
        } else {
            System.out.println("PlayList não definida.");    
        }
    }
    
    
    
    
    
    
    
}
