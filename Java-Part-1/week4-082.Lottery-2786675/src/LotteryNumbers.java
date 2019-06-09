import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        Random random = new Random();
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        while(this.numbers.size() < 7) {
            int lottonummero = random.nextInt(39)+1;
            if (this.numbers.contains(lottonummero)){
                
            } else {
                this.numbers.add(lottonummero);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers().contains(number)) {
            return true;
        } else {
            return false;
        }
        
    }
}
