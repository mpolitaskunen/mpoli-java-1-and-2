import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class Database {
    private ArrayList<Bird> linnut = new ArrayList<Bird>();
    
    public Database() {
        
    }
    
    public void addBird(Bird lintu) {
        this.linnut.add(lintu);
    }
    
    public String searchBird(String haku) {
        for(Bird lintu:this.linnut) {
            String nimi = lintu.toString();
            
            haku=haku.toUpperCase();
            haku=haku.trim();
            nimi=nimi.toUpperCase();
            nimi=nimi.trim();
            
            
            if(nimi.contains(haku)) {
                return lintu.toString();
            } 
        }
        
        return "Is not a bird!";
    }
    
    public void addObs(String hakunimi) {
        for(Bird lintu:this.linnut) {
            String nimi = lintu.toString();
            
            hakunimi=hakunimi.toUpperCase();
            hakunimi=hakunimi.trim();
            nimi=nimi.toUpperCase();
            nimi=nimi.trim();
            
            if(nimi.contains(hakunimi)) {
                lintu.addObs();
            }    
        } 
    }
    
    public void printAll() {
        for(Bird lintu:this.linnut) {
            System.out.println(lintu.toString());
        }
    }
    
    public String showBird(String haku) {
        for(Bird lintu:this.linnut) {
            lintu.toString();
            String nimi = lintu.toString();
            
            haku = haku.toUpperCase();
            haku = haku.trim();
            nimi = nimi.toUpperCase();
            nimi = nimi.trim();
            
            if(nimi.contains(haku)) {
                return lintu.toString();
            }
        }
        
        return "Not found.";
    }
    
    
}
