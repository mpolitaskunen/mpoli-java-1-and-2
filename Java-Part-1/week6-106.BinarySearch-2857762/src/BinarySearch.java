public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;
        int middle = 0;

        while (beginning <= end) {
            middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            } else if (array[middle] > searchedValue) {
                end = middle - 1 ;
            } else if (array[middle] < searchedValue){
                beginning = middle + 1;
            } 

            // restrict the search area 
        }
        return false;
    }
}
