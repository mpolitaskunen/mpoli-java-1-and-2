public class Main {
    public static void main(String[] args) {
        // Test your program here
        String word = "carrot";
        System.out.println("Ennen muutosta: " + word);
        Changer muuttujat = new Changer();
        
        muuttujat.addChange(new Change('a', 'b'));
        muuttujat.addChange(new Change('c', 'x'));
        muuttujat.addChange(new Change('o', 'å'));
        
        word = muuttujat.change(word);
        
        System.out.println("Muutoksen jälkeen: " + word);
        
    }
}
