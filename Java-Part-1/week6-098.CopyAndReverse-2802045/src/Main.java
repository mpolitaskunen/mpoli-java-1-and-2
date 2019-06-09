import java.util.Arrays;

public class Main {
    
    public static int[] copy(int[] array) {
        int[] temppi = new int[array.length];
        for(int i=0;i<array.length;i++) {
           temppi[i] = array[i];
        }
        return temppi;
    }
    
    public static int[] reverseCopy(int[] array) {
        int startti=0;
        int[] temppi = new int[array.length];
        for(int i=array.length-1;i>=0;i--) {
            System.out.println(startti);
            System.out.println(i);
            System.out.println(array[startti]);
            
            temppi[i] = array[startti];
            System.out.println(temppi[i]);
            startti++;
        }
        return temppi;
    }

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        

        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
}
