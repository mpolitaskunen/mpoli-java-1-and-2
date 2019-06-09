/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author seppo.taskunen
 */
public class Printer {
    private Scanner lukija;
    private List<String> rivit;

    public Printer(String fileName) throws Exception {
        this.lukija = new Scanner(new File(fileName));
        this.rivit = new ArrayList<String>();
        
        while(this.lukija.hasNextLine()) {
            this.rivit.add(this.lukija.nextLine());
        }
    }
    
    public void printLinesWhichContain(String word) {
        for(String i: this.rivit) {
            if(i.contains(word)) {
                System.out.println(i);
            }
        }
    }
}
