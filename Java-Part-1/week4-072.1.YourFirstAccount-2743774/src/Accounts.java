
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account bartosAccount = new Account("Barto's account", 100.0);
        
        System.out.println(bartosAccount);
        
        bartosAccount.deposit(20.0);
        
        System.out.println(bartosAccount);
    }

}
