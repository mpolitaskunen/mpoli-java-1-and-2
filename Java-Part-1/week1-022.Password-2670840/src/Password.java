
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String boomboom = reader.nextLine();
            
            if (boomboom.equals(password)) {
                System.out.println("Right!\n");
                System.out.println("The secret it: DOOM DOOM");
                break;
            } else { 
                System.out.println("Wrong!");
            }
        }
    }
}
