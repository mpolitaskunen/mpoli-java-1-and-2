/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author seppo.taskunen
 */
public class Thermometer implements Sensor{
    private boolean state;
    
    public Thermometer() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if(!this.state) {
            throw new IllegalStateException("Thermometer is not on!");
        }
        Random mittaus = new Random();
        return mittaus.nextInt(60) - 30;
    }
}
