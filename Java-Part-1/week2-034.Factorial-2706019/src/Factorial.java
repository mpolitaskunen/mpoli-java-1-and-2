import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int factorial = 1;
        int first = 1;
        int last = 0;
        
        System.out.println("Type a number: ");
        last = Integer.parseInt(reader.nextLine());
        
        while (first <= last) {
            factorial *= first;
            first++;
        }
        System.out.println("Factorial is " + factorial);
    }
}
