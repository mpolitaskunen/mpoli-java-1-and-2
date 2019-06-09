
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the points [0-60]: ");
        int number = Integer.parseInt(reader.nextLine());
                
        if (number <= 29) {
            System.out.println("Grade: failed");
        } else if (number <= 34) {
            System.out.println("Grade: 1");
        } else if (number <= 39) {
            System.out.println("Grade: 2");
        } else if (number <= 44) {
            System.out.println("Grade: 3");
        } else if (number <= 49) {
            System.out.println("Grade: 4");
        } else if (number <= 60) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Input proper value!");
        }
    }
}
