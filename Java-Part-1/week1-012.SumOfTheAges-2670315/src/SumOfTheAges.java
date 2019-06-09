
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here
                
        System.out.println("Type your name: ");
        String name1 = reader.nextLine();
        
        System.out.print("Type your age: ");
        int number = Integer.parseInt(reader.nextLine());
        
        System.out.println("Type your name: ");
        String name2 = reader.nextLine();
        
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        
        int summa = number + number2;
        
        System.out.println(name1 + " and " + name2 + " are " + summa + " years old in total.");
    }
}
