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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statements: ");
        System.out.println("  add - adds a word pair to the dictionary");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quit - quits the text user interface");
        System.out.println("");
        while(true) {
            System.out.print("Statement: ");
            String command = reader.nextLine();
            if(command.contains("quit")) {
                System.out.println("Cheers!");
                break;
            } else if(command.contains("add")){
                System.out.print("In Finnish: ");
                String word1 = reader.nextLine();
                System.out.print("Translation: ");
                String word2 = reader.nextLine();
                this.dictionary.add(word1,word2);
            } else if(command.contains("translate")) {
                System.out.print("Give me a word: ");
                String sana = reader.nextLine();
                System.out.println("Translation: " + this.dictionary.translate(sana));
            } else {
                System.out.println("Unknown statement");
            }
        }
    }
}
