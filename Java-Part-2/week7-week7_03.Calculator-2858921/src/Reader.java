import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Reader {
    private Scanner lukija = new Scanner(System.in);
    
    public Reader() {
    }
    
    public String readString(){
        return this.lukija.nextLine();
    }
    
    public int readInteger() {
        return Integer.parseInt(this.lukija.nextLine());
    }
}
