/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Player {
    private String name;
    private int goals;
    
    public Player(String nimi, int maalit) {
        this.name = nimi;
        this.goals = maalit;
    }
    
    public Player(String nimi) {
        this.name = nimi;
        this.goals = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int goals() {
        return this.goals;
    }
    
    public String toString() {
        return this.name + ", goals " + this.goals;
    }
    
}
