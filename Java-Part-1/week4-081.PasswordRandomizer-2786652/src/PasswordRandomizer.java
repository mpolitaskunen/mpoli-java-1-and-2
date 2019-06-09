import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length=length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String password = "";
        String letters = "abcdefghijlkmnopqrstuvwxyz";
        Random random = new Random();
        
        int i = 0;
        
        while (i < this.length) {
            password += letters.charAt(random.nextInt(26));
            i++;
        }
        
        return password;
    }
}
