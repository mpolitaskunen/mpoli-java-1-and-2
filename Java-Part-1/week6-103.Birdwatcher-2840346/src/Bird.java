/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class Bird {
    private String name;
    private String latinname;
    private int obs;
    
    public Bird(String name, String latinname) {
        this.name = name;
        this.latinname = latinname;
        this.obs = 0;
    }
    
    public String toString() {
        return this.name + " (" + this.latinname + "): " + this.obs + " observations";
    }
    
    public String nimi() {
        return this.name;
    }
    
    public String latinname() {
        return this.latinname;
    }
    
    public void addObs() {
        this.obs++;
    }
}
