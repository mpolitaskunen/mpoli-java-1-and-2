
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int pituus = text.length();
        int viimeinen = text.length()-1;
        int luuppi = 0;
        String vastaus = "";
        
        while (viimeinen >= luuppi) {
            vastaus = vastaus + text.charAt(viimeinen);
            viimeinen--;
        }
        return vastaus;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
