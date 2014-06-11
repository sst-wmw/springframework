/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.wmw.sst.springframework;

import br.com.wmw.sst.springframework.dependecyInjection.Player;
import br.com.wmw.sst.springframework.dependecyInjection.RockPlayList;
import br.com.wmw.sst.springframework.dependecyInjection.SertanejoPlayList;

/**
 *
 * @author Richard
 */
public class MainDependencyInjection {

    public static void main(String[] args) {
        
        RockPlayList rockList = new RockPlayList();
        rockList.defineEqualizador(100, 70, 50);
        
        SertanejoPlayList sertanejoList = new SertanejoPlayList();
        sertanejoList.defineEqualizador(70, 70, 60);

        Player player = null;
        
        //Constructor Injection
        player = new Player(rockList);
        
        player.showEqualizador();
        player.setEqualizador(100, 100, 100);
        player.showEqualizador();
        player.showMusicas();
        
        System.out.println("\n---------------------------------------------------------\n");
        
        //Setter Injection
        player = new Player();
        player.setPlayList(sertanejoList);
        player.showEqualizador();
        player.showMusicas();
        

        
    }
    
}
