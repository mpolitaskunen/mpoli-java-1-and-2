import java.util.HashMap;
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
public class Dictionary {
    private HashMap<String, String> sanakirja;
    
    public Dictionary() {
        this.sanakirja = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if(this.sanakirja.containsKey(word)) {
            return this.sanakirja.get(word);
        } else {
            return null;
        }
    }
    
    public void add(String word, String translation) {
        this.sanakirja.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.sanakirja.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> temppi = new ArrayList<String>();
        
        for(String sana: sanakirja.keySet()) {
            String juttu = sana + " = " + this.sanakirja.get(sana);
            temppi.add(juttu);
        }
        return temppi;
    }
}
