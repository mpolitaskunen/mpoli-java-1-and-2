/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeon;

/**
 *
 * @author seppo.taskunen
 */
public class Player {
    private int xPos;
    private int yPos;
    private int mapX;
    private int mapY;
    
    public Player(int mapX, int mapY) {
        this.xPos = 0;
        this.yPos = 0;
        this.mapX = mapX-1;
        this.mapY = mapY-1;
        
    }
    
    public void move(int x, int y) {
        this.xPos += x;
        this.yPos += y;
    }
    
    public int xPos() {
        return this.xPos;
    }
    
    public int yPos() {
        return this.yPos;
    }
    
    public void command(char command) {
        if(command == 'w') {
            if (this.yPos > 0) {
                this.yPos--;
            }
        } else if(command == 's') {
            if (this.yPos < this.mapY) {
                this.yPos++;
            }
        } else if(command == 'a') {
            if (this.xPos > 0) {
                this.xPos--;
            }
        } else if(command == 'd') {
            if (this.xPos < this.mapX) {
                this.xPos++;
            }
        }
    }
    
    @Override
    public String toString(){
        return "@ " + this.xPos + " " + this.yPos;
    }
    
    public String coordinates() {
        return this.xPos + "x " + this.yPos + "y";
    }
}
