/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Airplane {
    private int capacity;
    private String id;
    
    public Airplane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }
    
    public String planeId() {
        return this.id;
    }
    
    public String toString() {
        return this.id + " (" + this.capacity + " ppl)";
    }
}
