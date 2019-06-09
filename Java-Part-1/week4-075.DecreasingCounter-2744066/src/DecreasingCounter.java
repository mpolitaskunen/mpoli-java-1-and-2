public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int initialValue;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.initialValue = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }
    
    public void setInitial() {
        this.value = this.initialValue;
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (this.value < 1) {
            
        } else {
            this.value--;
        }
    }
    
    public void reset() {
        this.value = 0;
    }

    // and here the rest of the methods
}
