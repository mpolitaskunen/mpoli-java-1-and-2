import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        char vastaus = firstCharacter(input);
        System.out.println("First character: " + vastaus);
    }
    
    public static char firstCharacter(String text) {
        char character = text.charAt(0);
        return character;
    }
}
