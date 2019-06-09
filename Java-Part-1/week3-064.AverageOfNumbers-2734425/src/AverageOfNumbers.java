
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int summa = 0;
        
        for (Integer number : list) {
            summa += number;
        }
        return summa;
    }
    

    public static double average(ArrayList<Integer> list) {
        double koko = list.size();
        
        double result = sum(list)/koko;
        
        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}