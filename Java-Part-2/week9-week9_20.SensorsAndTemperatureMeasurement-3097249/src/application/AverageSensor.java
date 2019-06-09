/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seppo.taskunen
 */
public class AverageSensor implements Sensor {
    private ArrayList<Sensor> sensors;
    private List<Integer> temperatures;
    
    public AverageSensor() {
        this.sensors = new ArrayList<Sensor>();
        this.temperatures = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional) {
        this.sensors.add(additional);
    }
    
    public List<Integer> readings() {
        return this.temperatures;
    }
    
    @Override
    public boolean isOn() {
        for(Sensor i:this.sensors) {
            if(!i.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor i:this.sensors) {
            i.on();
        }
    }

    @Override
    public void off() {
        for(Sensor i:this.sensors) {
            i.off();
        }
    }

    @Override
    public int measure() {
        int temperature = 0;
        int count = 0;
        int export = 0;
        
        for(Sensor i:this.sensors) {
            temperature += i.measure();
            count++;
        }
        
        export = temperature / count;
        
        this.temperatures.add(export);
        
        return export;
    }
    
}
