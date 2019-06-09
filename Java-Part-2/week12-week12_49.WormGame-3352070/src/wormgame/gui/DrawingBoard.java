/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.game.WormGame;

/**
 *
 * @author seppo.taskunen
 */
public class DrawingBoard extends JPanel implements Updatable {
    private WormGame wormgame;
    private int pL;
    
    public DrawingBoard(WormGame wormgame, int pieceLength) {
        this.wormgame = wormgame;
        this.pL = pieceLength;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Piece p:this.wormgame.getWorm().getPieces()){
            g.setColor(Color.BLACK);
            g.fill3DRect(this.pL * p.getX(), this.pL * p.getY(), this.pL, this.pL, true);
        }
        
        g.setColor(Color.RED);
        g.fillOval(this.pL * this.wormgame.getApple().getX(), this.pL * this.wormgame.getApple().getY(), this.pL, this.pL);
    }

    @Override
    public void update() {
        super.repaint();
    }
}
