import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Container {
    private ArrayList<Suitcase> kontti = new ArrayList<Suitcase>();
    private int maxWeight;
    
    public Container(int weight) {
        this.maxWeight = weight;
    }
    
    public int contWeight() {
        int paino = 0;
        for(Suitcase suitcase:kontti){
            paino += suitcase.totalWeight();
        }
        
        return paino;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int paino = this.contWeight();
        
        if((paino+suitcase.totalWeight())>this.maxWeight) {
            
        } else {
            this.kontti.add(suitcase);
        }
    }
    
    public void printThings() {
        for(Suitcase salkku:kontti) {
            salkku.printThings();
        }
    }
    
    public String toString() {
        int count = this.kontti.size();
        int paino = this.contWeight();
        
        return count + " suitcases (" + paino + " kg)";
    }
    
}
