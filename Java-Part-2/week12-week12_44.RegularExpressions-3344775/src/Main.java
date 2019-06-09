import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write test code here
        Scanner r = new Scanner(System.in);
        
        System.out.print("Give a string: ");
        String s = r.nextLine();
        
        if(isAWeekDay(s) == true) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
        if(allVowels(s) == true) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
        if(clockTime(s) == true) {
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }        
    }
    
    public static boolean isAWeekDay(String string) {
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean allVowels(String string) {
        if(string.matches("(a|e|i|o|u|y|ä|ö)+")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean clockTime(String string) {
        if(string.matches("([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]")) {
            return true;
        } else {
            return false;
        }
    }
}
