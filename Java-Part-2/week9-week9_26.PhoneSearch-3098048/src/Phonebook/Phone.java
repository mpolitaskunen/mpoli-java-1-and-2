/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phonebook;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author seppo.taskunen
 */
public class Phone {
    private Set<String> numbers;
    
    public Phone() {
        this.numbers = new HashSet<String>();
    }
    
    public void add(String number) {
        this.numbers.add(number);
    }
    
    public Set<String> getNumbers() {
        return this.numbers;
    }
}
