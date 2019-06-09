
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // write your code here
        int upper = 0;
        int lower = 0;
        
        System.out.println("First: ");
        lower = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        upper = Integer.parseInt(reader.nextLine());
        
        while (lower <= upper) {
            System.out.println(lower);
            lower++;
        }

    }
}
