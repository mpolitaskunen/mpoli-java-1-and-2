public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }
    
    public void addNumber(int number) {
        if (number == -1) {
        } else {
            this.sum += number;
            this.amountOfNumbers++;
        }
    }
    
    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum() {
        return this.sum;
    }
      
    public double average () {
        if (this.sum <= 0 || this.amountOfNumbers <= 0) {
            return 0;
        } else {
            return this.sum / (double)this.amountOfNumbers;
        }
        
    }
}
