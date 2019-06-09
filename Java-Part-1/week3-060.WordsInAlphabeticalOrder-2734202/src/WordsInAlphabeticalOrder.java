
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
         ArrayList<String> sanat = new ArrayList<String>();
         
         while (true) {
             System.out.print("Type a word: ");
             String sana = reader.nextLine();
             
             if (sana.isEmpty()) {
                 break;
             } else {
                 sanat.add(sana);
             }
         }
         
         Collections.sort(sanat);
         
         for(String sana:sanat) {
             System.out.println(sana);
         }
    }
}
