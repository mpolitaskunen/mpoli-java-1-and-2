import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int pituus = text.length();
        int viimeinen = text.length()-1;
        int luuppi = 0;
        String ulostulo = "";
        
        while (viimeinen >= luuppi) {
            ulostulo = ulostulo + text.charAt(viimeinen);
            viimeinen--;
        }
        
        if (ulostulo.equals(text)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
