/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;

/**
 *
 * @author seppo.taskunen
 */
public class UserInterface {
    public UserInterface() {
    }
    
    public void printCoordinates(List<Vampire> vamps,Player p,int moves) {
        System.out.println(moves + "\n");
        System.out.println(p.toString());
        for(Vampire v:vamps){
            System.out.println(v.toString());
        }
        System.out.println("");
    }
}
