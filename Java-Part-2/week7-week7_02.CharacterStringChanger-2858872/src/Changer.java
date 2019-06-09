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
public class Changer {
    private ArrayList<Change> changes = new ArrayList<Change>();
    
    public Changer() {
    }
    
    public void addChange(Change change) {
        this.changes.add(change);
    }
    
    public String change(String characterString) {
        String muuttuja = "";
        System.out.println("CharacterString: " + characterString);
        
        muuttuja = characterString;
        
        for(Change muutos:this.changes) {
            System.out.println("Muuttuja iteraatio: " + muuttuja);
            muuttuja = muutos.change(muuttuja);
        }
        
        return muuttuja;
    }
}
