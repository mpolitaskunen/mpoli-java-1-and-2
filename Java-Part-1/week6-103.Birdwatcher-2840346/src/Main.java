import java.util.Scanner;

public class Main {  

    public static void main(String[] args) {
        
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner l = new Scanner(System.in);
        
        Database kanta = new Database();
        
        while(true) {
            System.out.print("? ");
            String komento = l.nextLine();
            
            komento = komento.toUpperCase();
            komento = komento.trim();
            
            if(komento.contains("ADD")) {
                System.out.print("Name: ");
                String nimi = l.nextLine();
                System.out.print("Latin Name: ");
                String lnimi = l.nextLine();
                Bird lisaa = new Bird(nimi,lnimi);
                lisaa.toString();
                
                kanta.addBird(lisaa);
            } else if (komento.contains("OBSERVATION")) {
                System.out.print("What was observed? ");
                String nimi = l.nextLine();
                
                kanta.searchBird(nimi);
                
                if(!kanta.searchBird(nimi).contains("Is not")) {
                    kanta.addObs(nimi);
                }
            } else if(komento.contains("STATISTICS")) {
                kanta.printAll();
            } else if(komento.contains("SHOW")) {
                System.out.print("What? ");
                String nimi = l.nextLine();
                
                System.out.println(kanta.showBird(nimi));
            } else if(komento.contains("QUIT")) {
                break;
            }
        }
    }
}
