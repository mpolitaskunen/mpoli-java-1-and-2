
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name: ");
        String sana = reader.nextLine();
        int pituus = calculateCharacters(sana);
        System.out.println("Number of characters: " + pituus);
        
    }
    
    // do here the method
    // public static int calculateCharacters(String text)
    public static int calculateCharacters(String text) {
        int pituus = text.length();
        return pituus;
    }
}
