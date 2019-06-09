
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int number = Integer.parseInt(reader.nextLine());
        
        if (number%4 == 0 && number%100 == 0 && number%400 == 0 && number > 400) {
            System.out.println("The year is a leap year.");
        } else if (number == 100) {
            System.out.println("The year is not a leap year.");
        } else if (number%4 == 0 && number%100 == 0 && number%400 > 0 && number > 100) {
            System.out.println("The year is not a leap year.");
        } else if (number%4 == 0){
            System.out.println("The year is a leap year.");
        } else if (number%4 > 0) {
            System.out.println("The year is not a leap year.");
        }
    }
}
