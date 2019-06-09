
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int luuppi = 0;
        
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
        int pituus = name.length();
        
        while (luuppi <= pituus) {
            int teksti = luuppi+1;
            if (luuppi == pituus) {
                break;
            } else {
                System.out.println(teksti + ". character: " + name.charAt(luuppi));
                luuppi++;
            }
        }
    }
}
