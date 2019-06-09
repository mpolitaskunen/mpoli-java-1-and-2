
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int what = 0;
        int sum = 0;
        int run = 0;
        
        System.out.println("Until what? ");
        what = Integer.parseInt(reader.nextLine());
        
        while (run <= what) {
            sum += run;
            run++;
        }
        
        System.out.println("Sum is " + sum);
    }
}
