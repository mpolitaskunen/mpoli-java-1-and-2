/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

import java.util.Random;

/**
 *
 * @author seppo.taskunen
 */
public class Vampire {
    private int x;
    private int y;
    private int mapX;
    private int mapY;
    
    public Vampire(int x, int y) {
        this.mapX = x;
        this.mapY = y;
        this.x = new Random().nextInt(x);
        this.y = new Random().nextInt(y);
    }
    
    public int xPos() {
        return this.x;
    }
    
    public int yPos() {
        return this.y;
    }
    
    public void resetInitialPosition() {
        this.x = new Random().nextInt(this.mapX);
        this.y = new Random().nextInt(this.mapY);
    }
    
    public void initialPositionNotZero() {
        while (this.x==0) {
            this.x = new Random().nextInt(this.mapX);
        }
        
        while (this.y==0) {
            this.y = new Random().nextInt(this.mapY);
        }
    }
    
    public void moveRandom() {
        while(true) {
            int suunta = new Random().nextInt(4);
            
            if(suunta == 0) {
                if(this.y > 0) {
                    this.y--;
                    break;
                }
            } else if (suunta == 1) {
                if(this.y < this.mapY - 1) {
                    this.y++;
                    break;
                }
            } else if (suunta == 2) {
                if(this.x > 0) {
                    this.x--;
                    break;
                }
            } else if (suunta == 3) {
                if (this.x < this.mapX - 1) {
                    this.x++;
                    break;
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "v " + this.x + " " + this.y;
    }
    
    public String coordinates() {
        return this.x + "x " + this.y + "y";
    }
}
