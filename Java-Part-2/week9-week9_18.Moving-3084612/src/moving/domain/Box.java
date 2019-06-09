/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seppo.taskunen
 */
public class Box implements Thing {
    private int maximumCapacity;
    // private int usedCapacity;
    private List<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        // this.usedCapacity = 0;
        this.things = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if(thing.getVolume() + this.getVolume() > this.maximumCapacity) {
            return false;
        } else {
            this.things.add(thing);
            // this.usedCapacity += thing.getVolume();
            return true;
        }        
    }
    
    @Override
    public int getVolume() {
        // return this.usedCapacity;
        int volumeUsed = 0;
        
        for (Thing i:this.things) {
            volumeUsed += i.getVolume();
        }
        
        return volumeUsed;
    }
}
