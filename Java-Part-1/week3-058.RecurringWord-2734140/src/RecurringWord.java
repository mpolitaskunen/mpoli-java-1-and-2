
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> sanat = new ArrayList<String>();
        
        while(true) {
            System.out.print("Type a word: ");
            String sana = reader.nextLine();
        
            if(sanat.contains(sana)) {
                System.out.println("You gave twice the word " + sana);
                break;
            } else {
                sanat.add(sana);
            }
        }
    }
}
