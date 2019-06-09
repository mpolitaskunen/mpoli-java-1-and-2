package wormgame.game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
import wormgame.*;
import wormgame.domain.*;
import wormgame.gui.*;

public class WormGame extends Timer implements ActionListener {

    private int width;
    private int height;
    private boolean continues;
    private Updatable updatable;
    private Worm worm;
    private Apple apple;

    public WormGame(int width, int height) {
        super(1000, null);

        this.width = width;
        this.height = height;
        this.continues = true;
        
        this.worm = new Worm(width/2,height/2,Direction.DOWN);
        this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
        
        while(this.worm.runsInto(apple)) {
            this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
        }

        addActionListener(this);
        setInitialDelay(2000);

    }


    public boolean continues() {
        return continues;
    }

    public void setUpdatable(Updatable updatable) {
        this.updatable = updatable;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
    
    public Worm getWorm() {
        return this.worm;
    }
    
    public void setWorm(Worm worm) {
        this.worm = worm;
    }
    
    public Apple getApple() {
        return this.apple;
    }
    
    public void setApple(Apple apple) {
        this.apple = apple;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (!continues) {
            return;
        }
        
        this.worm.move();
        
        if(this.worm.runsInto(apple)){
            this.worm.grow();
            while(this.worm.runsInto(apple)) {
                this.apple = new Apple(new Random().nextInt(this.width), new Random().nextInt(this.height));
            }
        } else if(this.worm.runsIntoItself()){
            this.continues = false;
        } else if(this.worm.wormHead().getX() == this.width || this.worm.wormHead().getX() < 0) {
            this.continues = false;
        } else if(this.worm.wormHead().getY() == this.height || this.worm.wormHead().getY() < 0) {
            this.continues = false;
        }
        
        this.updatable.update();
        
        super.setDelay(1000 / this.worm.getLength());
    }

}
