package wordinspection;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        // test your code here

        File file = new File("src/wordList.txt");
        // all words are in file src/wordList.txt
        // shortlist is shorter list, shortList.txt
        
        WordInspection testi = new WordInspection(file);
        
        System.out.println("Sanojen määrä: " + testi.wordCount());
        System.out.println("---------------------");
        System.out.println("Sanat missä Z-kirjain: " + testi.wordsContainingZ());
        System.out.println("---------------------");
        System.out.println("Sanat mitkä loppuvat l-kirjaimeen:" + testi.wordsEndingInL());
        System.out.println("---------------------");
        System.out.println("Sanat mitkä ovat palindromeja: " + testi.palindromes());
        System.out.println("---------------------");
        System.out.println("Sanat mitkä sisältävät kaikki vokaalit: " + testi.wordsWhichContainAllVowels());

    }
}
