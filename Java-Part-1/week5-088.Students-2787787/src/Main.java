
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        
        while(true){
            System.out.print("name: ");
            String nimi = reader.nextLine();
            
            if (nimi.isEmpty()) {
                break;
            }
            
            System.out.print("studentnumber: ");
            String nummero = reader.nextLine();
            
            list.add(new Student(nimi,nummero));
        }
        
        for (Student oppilas:list) {
            System.out.println(oppilas);
        }
        
        System.out.println("");
        
        System.out.print("Give search term: ");
        String hakutermi = reader.nextLine();
        
        System.out.println("Result:");
        for (Student oppilas:list) {
            String muuttuja = oppilas.getName();
            if (muuttuja.contains(hakutermi)) {
                System.out.println(oppilas);
            }
        }
    }
}