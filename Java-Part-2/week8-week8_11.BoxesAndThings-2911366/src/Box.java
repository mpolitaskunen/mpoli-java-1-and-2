import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> tobestored;
    
    public Box(double weight) {
        this.maxWeight = weight;
        this.tobestored = new ArrayList<ToBeStored>();
    }
    
    public double weight() {
        double weight = 0;
        
        for(ToBeStored item:tobestored) {
            weight += item.weight();
        }
        
        
        return weight;
    }
    
    public void add(ToBeStored item) {
        if((this.weight()+item.weight()) > maxWeight) {
            
        } else {
            this.tobestored.add(item);
        }
    }
    
    public int howManyItems() {
        return this.tobestored.size();
    }
    
    public String toString() {
        return "Box: " + this.howManyItems() + " things, total weight " + this.weight() + " kg";
    }
}
