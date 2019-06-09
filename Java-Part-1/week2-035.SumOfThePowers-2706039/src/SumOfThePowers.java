
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 0;
        int sum = 0;
        int start = 0;
        
        System.out.println("Type a number: ");
        number = Integer.parseInt(reader.nextLine());
        
        while (start <= number) {
            sum += (int)Math.pow(2,start);
            start++;
        }
        System.out.println("The result is " + sum);
    }
}
