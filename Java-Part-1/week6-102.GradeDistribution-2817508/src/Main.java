import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Scores s = new Scores();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes: ");
        while(true) {
            int arvo = Integer.parseInt(lukija.nextLine());
            if(arvo==-1) {
                break;
            } else if (arvo < 0 || arvo > 60) {
                System.out.println("Input proper value!");
            } else {
                s.addNumber(arvo);
            }
        }
        
        s.distribution();
        
    }
}
