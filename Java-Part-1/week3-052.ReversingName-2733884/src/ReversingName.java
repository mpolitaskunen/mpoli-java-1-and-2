import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String nimi = reader.nextLine();
        
        int pituus = nimi.length();
        int viimeinen = nimi.length()-1;
        int luuppi = 0;
        
        System.out.print("In reverse order: ");
        while (viimeinen >= luuppi) {
            System.out.print(nimi.charAt(viimeinen));
            viimeinen--;
        }
        System.out.print("\n");
        
        
        
        
    }
}
