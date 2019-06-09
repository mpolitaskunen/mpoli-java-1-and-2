import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nimi = reader.nextLine();
        if(nimi.length() <= 3) {
            System.out.println("");
        } else {
            System.out.println("1. character: " + nimi.charAt(0));
            System.out.println("2. character: " + nimi.charAt(1));
            System.out.println("3. character: " + nimi.charAt(2));
        }
        
    }
}
