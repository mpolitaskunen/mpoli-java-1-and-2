/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;

/**
 *
 * @author seppo.taskunen
 */
public class PersonalBoard extends GameOfLifeBoard{
    private Random r;
    private calculateNumberOfLivingNeighbours c;
    
    public PersonalBoard(int width, int height) {
        super(width, height);
        this.r = new Random();
        this.c = new calculateNumberOfLivingNeighbours();
    }

    @Override
    public void turnToLiving(int x, int y) {
        if(x > this.getWidth() || x < 0 || y > this.getHeight() || y < 0) {
            return;
        } else {
            getBoard()[x][y] = true;
        }
        
    }

    @Override
    public void turnToDead(int x, int y) {
        if(x > this.getWidth() || x < 0 || y > this.getHeight() || y < 0) {
            return;
        } else {
            getBoard()[x][y] = false;
        }
        
    }

    @Override
    public boolean isAlive(int x, int y) {
        if(x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            return getBoard()[x][y];
        } 
        return false;
        
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for(int i = 0; i < super.getBoard().length; i++) {
            for(int j = 0; j < super.getBoard()[i].length; j++) {
                double indQuot = r.nextDouble();
                if(indQuot <= probabilityForEachCell && probabilityForEachCell != 0) {
                    super.getBoard()[i][j] = true;
                } else {
                    super.getBoard()[i][j] = false;
                }
            }
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int counter = 0;
        
        if(x >= 0 && x < super.getWidth() && y >= 0 && y < super.getHeight()) {
            int middle = c.MiddleArea(x,y,super.getBoard());
            int borders = c.BordersWithoutCorners(x,y,super.getBoard());
            int corners = c.Corners(x,y,super.getBoard());
            counter = corners+borders+middle;
        }
        return counter;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {
        if (super.getBoard()[x][y] == true) {
            if (livingNeighbours < 2) {
                super.getBoard()[x][y] = false;
            } else if (livingNeighbours == 2 || livingNeighbours == 3) {
                super.getBoard()[x][y] = true;
            } else if (livingNeighbours > 3) {
                super.getBoard()[x][y] = false;
            }
        } else if (super.getBoard()[x][y] == false) {
            if (livingNeighbours < 2) {
                super.getBoard()[x][y] = false;
            } else if (livingNeighbours == 3) {
                super.getBoard()[x][y] = true;
            } else if (livingNeighbours > 3) {
                super.getBoard()[x][y] = false;
            }
        }
    }
    
}
