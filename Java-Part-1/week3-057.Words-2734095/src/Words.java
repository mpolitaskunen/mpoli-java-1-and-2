import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        int placement = 0;
        
        while (true) {
               
            System.out.print("Type a word: ");
            String sana = reader.nextLine();
        
            if (sana.isEmpty()) {
                break;
            } else {
                words.add(sana);
            }
        }
        
        System.out.println("You typed the following words: ");
        while (placement < words.size()) {
            System.out.println(words.get(placement));
            placement++;
        }
           
        
    }
}
