/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author seppo.taskunen
 */
public class WordInspection {
    private Scanner s;
    private List<String> l;
    
    public WordInspection(File file) throws Exception {
        this.s = new Scanner(file, "UTF-8");
        this.l = new ArrayList<String>();
        
        while(this.s.hasNextLine()) {
            this.l.add(s.nextLine());
        }
    }
    
    public int wordCount() {
        return this.l.size();
    }
    
    public List<String> wordsContainingZ() {
        List<String> temp = new ArrayList<String>();
        
        for(String a:this.l) {
            if(a.contains("z") || a.contains("Z")) {
                temp.add(a);
            }
        }
        
        return temp;
    }
    
    public List<String> wordsEndingInL() {
        List<String> temp = new ArrayList<String>();
        
        for(String a:this.l) {
            if(a.endsWith("l") || a.endsWith("L")) {
                temp.add(a);
            }
        }
        
        return temp;
    }
    
    public List<String> palindromes() {
        List<String> temp = new ArrayList<String>();
        
        for(String a:this.l) {
            // Initialize a temporary String variable b
            String b = "";
            
            // Let's reverse a into b with this for-loop
            
            for(int e = a.length()-1; e >= 0; e--) {
                b = b + a.charAt(e);
            }
            
            // And let's compare a to b and add a to temp if it equals to b
            
            if(a.equalsIgnoreCase(b)) {
                temp.add(a);
            }
        }
        
        return temp;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        List<String> temp = new ArrayList<String>();
        
        for(String a:this.l) {
            if(a.contains("a") && a.contains("e") && a.contains("i") && a.contains("o") && a.contains("u") && a.contains("y") && a.contains("ä") && a.contains("ö")) {
                temp.add(a);
            }
        }
        return temp;
    }
}
