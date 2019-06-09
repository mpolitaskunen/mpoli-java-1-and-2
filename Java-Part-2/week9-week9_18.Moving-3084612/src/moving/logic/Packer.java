/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;
import moving.domain.Item;

/**
 *
 * @author seppo.taskunen
 */
public class Packer {
    private int boxesVolume;
    
    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }
    
    public List<Box> packThings(List<Thing> things) {
        List<Box> puskuri = new ArrayList<Box>();
        Box box = new Box(this.boxesVolume);
        
        for (Thing i: things) {
            // System.out.println("Adding item: "+ i.toString());
            if(box.addThing(i) == false) {
                puskuri.add(box);
                // System.out.println("Creating new box...");
                box = new Box(this.boxesVolume);
                box.addThing(i);
            }
        }
        puskuri.add(box);
        
        return puskuri;
    }
}
