/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author seppo.taskunen
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private int duplicates;
    private Set<String> setti;
    
    public PersonalDuplicateRemover() {
        this.duplicates = 0;
        this.setti = new HashSet<String>();
    }
    
    @Override
    public void add(String characterString) {
        if(!this.setti.contains(characterString)) {
            this.setti.add(characterString);
        } else {
            this.duplicates++;
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicates;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() { 
        return this.setti;
    }

    @Override
    public void empty() {
        this.duplicates = 0;
        
        this.setti.clear();
    }
    
}
