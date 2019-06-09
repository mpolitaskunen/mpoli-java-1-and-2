import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String input = reader.nextLine();
        char lastchar = lastCharacter(input);
        System.out.println("Last character: " + lastchar);
    }
    
    public static char lastCharacter(String text) {
        char last = text.charAt(text.length()-1);
        return last;
    }
}
