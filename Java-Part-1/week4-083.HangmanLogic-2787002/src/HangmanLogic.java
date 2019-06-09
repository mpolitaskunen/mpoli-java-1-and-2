
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (!this.guessedLetters.contains(letter)) {
            if(this.word.contains(letter)) {
                this.guessedLetters += letter;
            } else {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            }
        }
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        if(this.guessedLetters.length()==0){
            String editingword = "";
            
            for(int i = 0; i <this.word.length(); i++) {
                editingword += "_";
            }
            return editingword;
        } else {
            return "_OO_";
        }

    }
}
