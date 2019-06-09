
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first word: ");
        String sana1 = reader.nextLine();
        
        System.out.print("Type the second word: ");
        String sana2 = reader.nextLine();
        
        int index = sana1.indexOf(sana2);
        
        if (index == -1) {
            System.out.println("The word '" + sana2 + "' is not found in the word '" + sana1 + "'.");  
        } else {
            System.out.println("The word '" + sana2 + "' is found in the word '" + sana1 + "'.");
        }
    }
}
