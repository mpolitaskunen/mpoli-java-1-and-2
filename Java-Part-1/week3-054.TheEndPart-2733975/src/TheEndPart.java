import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
                
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        System.out.print("Length of the first part: ");
        int pituus = Integer.parseInt(reader.nextLine());
        
        int alku = word.length() - pituus;
                      
        System.out.println("Result: " + word.substring(alku));
    }
}
