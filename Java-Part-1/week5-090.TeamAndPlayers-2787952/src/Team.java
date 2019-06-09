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
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team (String nimi) {
        this.name = nimi;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public String getName() {
        return  this.name;
    }
    
    public String toString(){
        return this.name;
    }
    
    public void addPlayer(String nimi, int maalit) {
        if(this.size() >= this.maxSize) {
            
        } else {
            this.players.add(new Player(nimi, maalit));
        }
        
    }
    
    public void addPlayer(Player nimi) {
        if(this.size() >= this.maxSize) {
            
        } else {
            this.players.add(nimi);
        }
    }
    
    public void printPlayers() {
        for (Player player:players) {
            System.out.println(player);
        }
    }
    
    public int size() {
        return this.players.size();
    }
    
    public int goals() {
        int goals=0;
        for(Player player:players) {
            goals+=player.goals();
        }
        return goals;
    }
}
