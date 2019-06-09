/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author seppo.taskunen
 */
public class ConstantSensor implements Sensor {
    private int parameter;
    
    public ConstantSensor(int parameter) {
        this.parameter = parameter;
    }
    
    @Override
    public int measure() {
        return this.parameter;
    }
    
    @Override
    public void on() {
        
    }
    
    @Override
    public void off() {
        
    }

    @Override
    public boolean isOn() {
        return true;
    }
}
