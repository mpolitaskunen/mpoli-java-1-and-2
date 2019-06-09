/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author seppo.taskunen
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> d;
    
    public PersonalMultipleEntryDictionary() {
        this.d = new HashMap<String, Set<String>>();
    }
    @Override
    public void add(String word, String entry) {
        if(!this.d.containsKey(word)) {
            this.d.put(word, new HashSet<String>());
        }
        
        Set<String> temp = this.d.get(word);
        temp.add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        return this.d.get(word);
    }

    @Override
    public void remove(String word) {
        this.d.remove(word);
    }
    
}
