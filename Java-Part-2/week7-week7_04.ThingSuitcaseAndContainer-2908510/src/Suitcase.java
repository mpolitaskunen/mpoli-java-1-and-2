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
public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int weightLimit;
    
    public Suitcase(int limit) {
        this.weightLimit = limit;
    }
    
    public void addThing(Thing thing){
        int weight = 0;
        for(Thing juttu:things) {
            weight += juttu.getWeight();
        }
        
        if(weight + thing.getWeight() > this.weightLimit) {
            
        } else {
            this.things.add(thing);
        }
    }
    
    public void printThings() {
        for(Thing thing:things) {
            System.out.println(thing);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for (Thing thing:things) {
            weight += thing.getWeight();
        }
        
        return weight;
    }
    
    public Thing heaviestThing() {
        if(this.things.size()==0) {
            return null;
        } else {
            Thing paino = new Thing("Placeholder",0);
            for(Thing thing:things) {
                if(thing.getWeight()> paino.getWeight()) {
                    paino = thing;
                } 
            }
            return paino;
        }
    }
    
    public String toString(){
        int count = this.things.size();
        int weight = 0;
        
        if(count == 0) {
            return "empty (0 kg)";
        } else if (count == 1) {
            for(Thing thing:things) {
                weight += thing.getWeight();
            }
            return count + " thing (" + weight + " kg)";
        } else {
            for(Thing thing:things) {
                weight += thing.getWeight();
            }
            return count + " things (" + weight + " kg)";
        }
        
    }
    
}
