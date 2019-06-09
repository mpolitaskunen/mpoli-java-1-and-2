/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
import java.util.Collections;

/**
 *
 * @author Icedman
 */
public class ContainerHistory {
    private ArrayList<Double> history;
    
    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }
    
    public void add(double situation) {
        this.history.add(situation);
    }
    
    public void reset() {
        this.history.clear();
    }
    
    public double maxValue() {
        double palautus = 0;
        
        if(this.history.isEmpty()) {
            return 0;
        }
        
        for(Double d:this.history) {
            if(d >= palautus) {
                palautus = d;
            }
        }
        return palautus;
    }
    
    public double minValue() {
        double palautus = this.history.get(0);
        
        if (this.history.isEmpty()) {
            return 0;
        }
        
        for(Double d:this.history) {
            if(d <= palautus) {
                palautus=d;
            }
        }
        
        return palautus;
    }
    
    public double average() {
        double keskiarvo = 0;
        double temppi = 0;
        
        for(Double d:this.history) {
            temppi += d;
        }
        
        keskiarvo = temppi / this.history.size();
        
        return keskiarvo;
        
    }
    
    public double greatestFluctuation() {
        double vaihtelu = 0;
        List<Double> vaihteluLista = new ArrayList<Double>();
        
        if(this.history.isEmpty()||this.history.size() == 1) {
            return 0;
        } else {
            for(int i = 0; i < this.history.size();i++) {
                if(i != this.history.size() - 1) {
                    double a = this.history.get(i);
                    double b = this.history.get(i+1);
                    vaihtelu = b - a;
                    vaihteluLista.add(Math.abs(vaihtelu));
                } else {
                    double a = this.history.get(i-1);
                    double b = this.history.get(i);
                    vaihtelu = b - a;
                    vaihteluLista.add(Math.abs(vaihtelu));
                }
            }
        }
        return Collections.max(vaihteluLista);
    }
    
    public double variance() {
        double temppi = 0.0;
        
        if(this.history.isEmpty() || this.history.size() == 1) {
            return 0;
        }
        
        for(Double d:this.history) {
            temppi += ((d-this.average())*(d-this.average()));
        }
        
        temppi = temppi/(this.history.size()-1);
        
        return temppi;
        
    }
    
    public String toString() {
        return this.history.toString();
    }
}
