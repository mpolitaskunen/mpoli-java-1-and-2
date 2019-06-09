
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while (true) {
            System.out.print("Give me the temperature [-30c..+40c]: ");
            double tempinput = Double.parseDouble(reader.nextLine());
            
            if (tempinput <= -30 || tempinput >= 40) {
                System.out.println("Temperature range is between -30c to +40c!");
            } else {
                Graph.addNumber(tempinput);
            }
        }
        
        // Graph is used as follows:
        /* Graph.addNumber(7);
        double value = 13.5;
        Graph.addNumber(value);
        value = 3;
        Graph.addNumber(value); */
        // Remove or comment out these lines above before trying to run the tests.
    }
}