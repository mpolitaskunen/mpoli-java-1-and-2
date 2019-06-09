/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Change {
    private char mista;
    private char mihin;
    
    public Change(char fromCharacter, char toCharacter) {
        this.mista = fromCharacter;
        this.mihin = toCharacter;
    }
    
    public String change(String characterString) {
        String muokattu = "";
        
        for (int i=0; i<characterString.length(); i++) {
            char character = characterString.charAt(i);
            if (character == this.mista) {
                muokattu += mihin;
            } else {
                muokattu += character;
            }
        }
        
        return muokattu;
    }
}
