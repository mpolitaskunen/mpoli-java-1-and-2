/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author seppo.taskunen
 */
public class Analysis {
    private Scanner l;
    private List<String> m;
    
    public Analysis(File file) throws Exception {
        this.l = new Scanner(file);
        this.m = new ArrayList<String>();
        
        while(this.l.hasNextLine()) {
            this.m.add(this.l.nextLine()+"\n");
        }
        
    }
    
    public int lines() {
        int a = 0;
        
        for(String i:this.m) {
            a++;
        }
        
        return a;
    }
    
    public int characters() {
        int a = 0;
        for(String i:this.m) {
            a += i.length();
        }
        
        return a;
    }
    
}
