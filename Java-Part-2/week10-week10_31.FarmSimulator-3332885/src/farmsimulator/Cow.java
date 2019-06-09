/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;

/**
 *
 * @author seppo.taskunen
 */
public class Cow implements Milkable,Alive {
    private String name;
    private double udderCapacity;
    private double udderVolume;
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };
    
    public Cow() {
        int index = new Random().nextInt(NAMES.length);
        this.name = (NAMES[index]);
        this.udderCapacity = 15 + new Random().nextInt(26);
    }
    
    public Cow(String name) {
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
    }
    
    public double getCapacity() {
        return this.udderCapacity;
    }
    
    public double getAmount() {
        return this.udderVolume;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.udderVolume) + "/" + this.udderCapacity;
    }

    @Override
    public double milk() {
        double temppi = this.udderVolume;
        this.udderVolume = 0;
        return temppi;
    }
    

    @Override
    public void liveHour() {
        double maitoa = 0.7 + (new Random().nextDouble() * 1.3);
        if(this.udderVolume + maitoa > this.udderCapacity) {
            this.udderVolume = this.udderCapacity;
        } else {
            this.udderVolume += maitoa;
        }
    }
    
    
    
}
