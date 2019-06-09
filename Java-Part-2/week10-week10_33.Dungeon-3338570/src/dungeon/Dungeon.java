/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.List;
import java.util.ArrayList;

import java.util.Random;

import java.util.Scanner;

/**
 *
 * @author seppo.taskunen
 */
public class Dungeon {
    private Map map;  
    private List<Vampire> vampires;
    private Player p;
    
    private boolean vampiresMove;
    private int moves;
    
    private Scanner s;
    private UserInterface ui;
    
    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.map = new Map(length,height);
        this.moves = moves;
        this.vampiresMove = vampiresMove;
        this.vampires = new ArrayList<Vampire>();
        
        for(int i = 0; i < vampires; i++) {
            this.vampires.add(new Vampire(length,height));
        }
        
        this.p = new Player(length,height);
        this.s = new Scanner(System.in);
        this.ui = new UserInterface();
    }
    
    public void run() {
        while(this.moves > 0) {
            ui.printCoordinates(this.vampires, this.p, this.moves);
            
            while(map.checkOverlap(this.vampires)) {
                this.resetInitialPositions();
            }
            
            map.drawMap(this.vampires,this.p);
            
            this.moves();
            
            if(vampires.size() == 0) {
                System.out.println("YOU WIN");
                break;
            }
            this.moves--;
        }
        if (vampires.size() != 0) {
            System.out.println("YOU LOSE");
        }
    }
    
    public void moves() {
        char[] command = this.s.nextLine().toLowerCase().toCharArray();
        for(int i = 0;i < command.length; i++) {
            this.p.command(command[i]);
            if(this.vampiresMove) {
                this.vampiresMove();
            }
            this.playerKills();
        }
    }
    
    public void vampiresMove() {
        List<Vampire> vampsB = new ArrayList<Vampire>(this.vampires);
        
        while(true) {
            for(Vampire v:this.vampires) {
                v.moveRandom();
            }
            
            //if(map.checkOverlap(this.vampires)) {
            //    this.vampires = vampsB;
            //}
            
            break;
        }
    }
    
    public void playerKills() {
        for(int j=0; j < this.vampires.size(); j++) {
            if(this.p.coordinates().equals(this.vampires.get(j).coordinates())) {
                this.vampires.remove(j);
            }
        }
    }
    
    public void resetInitialPositions() {
        for(Vampire v:this.vampires) {
            v.resetInitialPosition();
        }
    }
    
}
