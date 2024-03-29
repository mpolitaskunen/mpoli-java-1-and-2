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
public class Circle extends Figure {
    private int diameter;
    
    public Circle(int x, int y, int diameter) {
        super(x,y);
        this.diameter = diameter;
    }
    
    
    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillOval(super.getX(), super.getY(), this.diameter, this.diameter);
    }
    
}
