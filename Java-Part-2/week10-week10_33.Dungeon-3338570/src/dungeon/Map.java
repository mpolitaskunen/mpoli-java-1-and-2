/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author seppo.taskunen
 */
public class Map {
    private int width;
    private int height;
    
    public Map(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int height() {
        return this.height;
    }
    
    public int width() {
        return this.width;
    }
    
    public void drawMap(List<Vampire> vampires, Player p) {
        for(int y = 0; y < this.height; y++) {
            for(int x = 0; x < this.width; x++) {
                xLoop:
                while(true) {
                    if(p.coordinates().equals(x + "x " + y + "y")) {
                        System.out.print("@");
                        break;
                    }
                    
                    for(int i=0; i<vampires.size();i++) {
                        if(vampires.get(i).coordinates().equals(x + "x " + y + "y")) {
                            System.out.print("v");
                            break xLoop;
                        }
                    }
                    
                    System.out.print(".");
                    break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public boolean checkOverlap(List<Vampire> vamps) {
        for(int i = 0; i < vamps.size() - 1; i++) {
            for(int j = i+1; j < vamps.size(); j++) {
                if(vamps.get(i).coordinates().equals(vamps.get(j).coordinates())) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
}
