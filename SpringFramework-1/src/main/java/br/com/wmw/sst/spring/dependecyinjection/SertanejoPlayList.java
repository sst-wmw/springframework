/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework.dependecyInjection;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Richard
 */
public class SertanejoPlayList implements PlayList {
    
    private int graveSertanejo;
    private int medioSertanejo;
    private int agudoSertanejo;    

    @Override
    public List<Musica> getMusicas() {
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("Lapada na Rachada [Saia Rodada]", Musica.Genero.SERTANEJO));
        musicas.add(new Musica("È o Amor [Zezé Camargo e Luciano]", Musica.Genero.SERTANEJO));
        musicas.add(new Musica("Estressada [Cesar Menotti e Fabiano]", Musica.Genero.SERTANEJO));
        return musicas;
    }

    @Override
    public void defineEqualizador(int grave, int medio, int agudo) {
        this.graveSertanejo = grave;
        this.medioSertanejo = medio;
        this.agudoSertanejo = agudo;
    }

    @Override
    public void vizualizarEqualizador() {
        System.out.println("======= EQUALIZADOR =======");
        System.out.println(String.format("Grave: %s", graveSertanejo));
        System.out.println(String.format("Médio: %s", medioSertanejo));
        System.out.println(String.format("Agudo: %s", agudoSertanejo));
    }
    
}
