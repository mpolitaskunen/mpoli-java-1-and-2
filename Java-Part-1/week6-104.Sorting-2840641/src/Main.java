import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        // indexes: 0 1 2 3 4
        //int[] values = {6,5,8,7,11};
        
        // System.out.println("smallest: " + smallest(values));
       //  System.out.println("Index of the smallest: " + indexOfTheSmallest(values));
        
        /* int[] arvot = {-1, 6, 9, 8, 12};
        
        System.out.println(indexOfTheSmallestStartingFrom(arvot, 1));
        System.out.println(indexOfTheSmallestStartingFrom(arvot, 2));
        System.out.println(indexOfTheSmallestStartingFrom(arvot, 4)); */
        int[] values = {8,3,7,9,1,2,4};
        sort(values);
    }
    
    public static int smallest(int[] array) {
        int temppi = array[0];
        
        for(int a=0; a<array.length;a++) {
            if (array[a] < temppi) {
                temppi = array[a];
            }
        }
        
        return temppi;
    }
    
    public static int indexOfTheSmallest(int[] array) {
               
        int value = smallest(array);
        
        for(int i=0; i<array.length;i++) {
            if(array[i] == value) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        
        int arvo = array[index];
        
        for(int i=index; i<array.length;i++) {
            if(array[i] < arvo) {
                arvo = array[i];
            }
        }
        
        for(int b=index; b<array.length;b++) {
            if(array[b] == arvo) {
                return b;
            }
        }
        
        return -1;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temppi1 = array[index1];
        int temppi2 = array[index2];
        
        array[index1] = temppi2;
        array[index2] = temppi1;
        
    }
    
    public static void sort(int[] array) {
        int sortti1 = 0;
        int sortti2 = 0;

        System.out.println(Arrays.toString(array));
        for(int a=0; a<array.length;a++) {
            swap(array,a,indexOfTheSmallestStartingFrom(array,a));
            System.out.println(Arrays.toString(array));
        }
    }

}
