import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int blankko = 0;
        
        for(Integer number : list) {
            blankko = blankko + number;
        }
        return blankko;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double koko = list.size();
        
        double result = sum(list)/koko;
        
        return result;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double keskiarvo = average(list);
        double luuppi = 0;
        int maara = list.size()-1;
        
        for (Integer nummero : list) {
            
            double tuplaus = (nummero-keskiarvo)*(nummero-keskiarvo);
                                    
            luuppi += tuplaus;
            
        }
        
        double ulos = luuppi / maara;
        
        return ulos;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
