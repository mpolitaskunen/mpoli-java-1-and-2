
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int bigger = Math.max(number, number2);
        
        System.out.println("The bigger number of the two numbers given was: " + bigger);
        // Implement your program here. Remember to ask the input from user
    }
}
