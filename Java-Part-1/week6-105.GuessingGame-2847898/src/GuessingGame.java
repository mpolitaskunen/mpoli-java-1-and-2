import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        // write the guessing logic here
        while(true) {
            int muuttuja = this.average(lowerLimit, upperLimit);
            
            if(lowerLimit == upperLimit) {
                System.out.println("The number you're thinking of is " + lowerLimit);
                break;
            }
            if(this.isGreaterThan(muuttuja)) {
                if(muuttuja > lowerLimit) {
                    lowerLimit = muuttuja + 1;
                } else if (lowerLimit + 1 == upperLimit) {
                    System.out.println("The number you're thinking of is " + upperLimit);
                    break;
                }              
            } else {
                if(muuttuja < upperLimit) {
                    upperLimit = muuttuja;
                } else if (lowerLimit + 1 == upperLimit) {
                    System.out.println("The number you're thinking of is " + upperLimit);
                    break;
                }
            } 
        }

    }

    // implement here the methods isGreaterThan and average

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    
    public boolean isGreaterThan(int value) {
        System.out.println("Is your number greater than " + value + "? (y/n)");
        
        String vastaus = this.reader.nextLine();
        
        if(vastaus.equals("y")) {
            return true;
        } 
        
        return false;
    }
    
    public int average(int firstNumber, int secondNumber) {
        int summa = firstNumber+secondNumber;
        int average = summa/2;
        System.out.println("Firstnumber = " + firstNumber);
        System.out.println("Secondnumber= " + secondNumber);
        System.out.println("Summa = " + summa);
        System.out.println("Average is= " + average );
        return average;
    }
}
