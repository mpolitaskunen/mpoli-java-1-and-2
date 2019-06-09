/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author seppo.taskunen
 */
public class RingingCentre {
    private Map<Bird, List<String>> kartta;
    
    public RingingCentre(){
        this.kartta = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place) {
        List<String> paikat = new ArrayList<String>();
        
        if(!this.kartta.keySet().contains(bird)) {
            paikat.add(place);
            this.kartta.put(bird, paikat);
        } else {
            paikat = this.kartta.get(bird);
            paikat.add(place);
            this.kartta.put(bird, paikat);
        }
    }
    
    public void observations(Bird bird) {
        if(this.kartta.get(bird) == null) {
            System.out.println(bird.toString() + " observations: " + 0);
        } else {
            System.out.println(bird.toString() + " observations: " + this.kartta.get(bird).size());
            System.out.println(this.kartta.get(bird));
        }
    }
    
}
