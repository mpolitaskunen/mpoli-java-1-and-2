/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author seppo.taskunen
 */
public class MaxWeightBox extends Box {
    private List<Thing> items;
    private int maxWeight;
    
    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Thing>();
    }
    
    @Override
    public void add(Thing thing) {
        int curweight = 0;
        
        for(Thing t:this.items) {
            curweight += t.getWeight();
        }
        
        if(thing.getWeight() + curweight > this.maxWeight) {   
        } else {
            this.items.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing) {
        for(Thing t:this.items){
            if(thing.equals(t)) {
                return true;
            }
        }
        return false;
    }
   
}
