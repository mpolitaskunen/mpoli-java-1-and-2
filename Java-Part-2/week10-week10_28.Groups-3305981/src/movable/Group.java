/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Collection;

/**
 *
 * @author Icedman
 */
public class Group implements Movable {

    private List<Movable> organismit;
    
    public Group() {
        this.organismit = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        this.organismit.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable org:this.organismit) {
            org.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String result = "";
        for(Movable org:this.organismit) {
            result += org.toString() + "\n";
        }
        
        return result;
    }
    
}
