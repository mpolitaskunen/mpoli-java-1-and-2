/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author seppo.taskunen
 */
public class KeyboardListener implements KeyListener {
    private Component c;
    private Figure f;
    
    public KeyboardListener(Component c, Figure f) {
        this.c = c;
        this.f = f;
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_LEFT) {
            this.f.move(-1, 0);
        } else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.f.move(1, 0);
        } else if(e.getKeyCode() == KeyEvent.VK_UP) {
            this.f.move(0, -1);
        } else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
            this.f.move(0, 1);
        }
        c.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
