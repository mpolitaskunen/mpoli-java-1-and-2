
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int i = 0;
        int k = 1;                
        
        System.out.println("Up to what number? ");
        i = Integer.parseInt(reader.nextLine());
        
        while (k <= i) {
            System.out.println(k);
            k++;
        }
    }
}
