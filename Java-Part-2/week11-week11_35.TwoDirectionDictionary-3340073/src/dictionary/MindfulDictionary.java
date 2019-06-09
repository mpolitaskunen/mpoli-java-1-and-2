/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.Map;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author seppo.taskunen
 */
public class MindfulDictionary {
    private Map<String, String> kartta;
    private Map<String, String> invKartta;
    private String file;
    
    public MindfulDictionary() {
        this.kartta = new HashMap<String,String>();
        this.invKartta = new HashMap<String,String>();
    }
    
    public MindfulDictionary(String file) {
        this.kartta = new HashMap<String,String>();
        this.invKartta = new HashMap<String,String>();
        this.file = file;
    }
    
    public boolean load() {
        File filu = new File(this.file);
        
        try {
            Scanner r = new Scanner(filu);
            while(r.hasNextLine()) {
                String line = r.nextLine();
                String[] parts = line.split(":");
                this.kartta.put(parts[0], parts[1]);
                this.invKartta.put(parts[1], parts[0]);
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
    public boolean save(){
        try {
            FileWriter w = new FileWriter(this.file);
            
            for(String s:this.kartta.keySet()){
                w.write(s + ":" + this.kartta.get(s) + "\n");
            }
            w.close();
        } catch(Exception e) {
            return false;
        }
        return true;
    }
    
    public void add(String word, String translation) {
        if(this.kartta.containsKey(word)) {
        } else {
            this.kartta.put(word, translation);
            this.invKartta.put(translation, word);
        }
    }
    
    public void remove(String word) {
        if(this.kartta.containsKey(word)) {
            String temppi = this.kartta.get(word);
            this.kartta.remove(word);
            this.invKartta.remove(temppi);
        } else if(this.invKartta.containsKey(word)){
            String temppi = this.invKartta.get(word);
            this.kartta.remove(temppi);
            this.invKartta.remove(word);
        }
    }
    
    public String translate(String word) {
        if(this.kartta.containsKey(word)) {
            return this.kartta.get(word);
        } else {
            return this.invKartta.get(word);
        }
    }
}