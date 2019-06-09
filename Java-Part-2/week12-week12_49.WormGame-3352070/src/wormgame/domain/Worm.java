/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.domain;

import java.util.List;
import java.util.ArrayList;
import wormgame.*;

/**
 *
 * @author seppo.taskunen
 */
public class Worm {
    private Direction direction;
    private List<Piece> pieces;
    private int x;
    private int y;
    private boolean grow;
    
    
    public Worm(int origX, int origY, Direction origDir) {
        this.x = origX;
        this.y = origY;
        this.grow = false;
        this.direction = origDir;
        this.pieces = new ArrayList<Piece>();
        this.pieces.add(new Piece(origX, origY));
    }
    
    public Direction getDirection() {
        return this.direction;
    }
    
    public void setDirection(Direction dir) {
        this.direction = dir;
    }
    
    public int getLength() {
        return this.pieces.size();
    }
    
    public List<Piece> getPieces() {
        return this.pieces;
    }
    
    public void move() {
        int newX = this.pieces.get(this.pieces.size()-1).getX();
        int newY = this.pieces.get(this.pieces.size()-1).getY();
        
        if(this.direction == Direction.UP) {
            newY--;
        } else if(this.direction == Direction.DOWN) {
            newY++;
        } else if(this.direction == Direction.LEFT) {
            newX--;
        } else if(this.direction == Direction.RIGHT) {
            newX++;
        }
        
        if(this.getLength() > 2 && !this.grow) {
            this.pieces.remove(0);
        }
        
        if(this.grow = true) {
            grow = false;
        }
        
        this.pieces.add(new Piece(newX,newY));
    }
    
    public void grow() {
        this.grow = true;
    }
    
    public boolean runsInto(Piece piece) {
        for(int i=0; i<this.getLength();i++) {
            if(this.pieces.get(i).getX() == piece.getX() && this.pieces.get(i).getY() == piece.getY()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean runsIntoItself() {
        for(int i=0; i<this.getLength()-1;i++){
            if(this.wormHead().getX() == this.pieces.get(i).getX() && this.wormHead().getY() == this.pieces.get(i).getY()) {
                return true;
            }
        }
        return false;
    }
    
    public Piece wormHead() {
        return this.pieces.get(this.getLength()-1);
    }
}
