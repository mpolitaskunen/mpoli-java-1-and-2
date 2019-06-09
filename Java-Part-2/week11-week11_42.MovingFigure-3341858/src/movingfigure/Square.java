/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author seppo.taskunen
 */
public class Square extends Figure{
    private int side;
    
    public Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(super.getX(),super.getY(),this.side, this.side);
    }
    
}
