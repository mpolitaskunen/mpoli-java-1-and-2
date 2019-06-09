public class Main {
    public static void main(String[] args) {
        // test your code here

        // Team barcelona = new Team("FC Barcelona");
        // System.out.println("Team: " + barcelona.getName());
        Team barcelona = new Team("FC Barcelona");
        System.out.println("Team: " + barcelona.getName());
        
        Player brian = new Player("Brian");
        System.out.println("Player: " + brian);

        Player pekka = new Player("Pekka", 39);
        System.out.println("Player: " + pekka);
        
        barcelona.addPlayer(brian);
        barcelona.addPlayer(pekka);
        barcelona.addPlayer(new Player("Mikael",1));
        
        barcelona.printPlayers();
        
        System.out.println("Number of Players: " + barcelona.size());
        System.out.println("Total goals: " + barcelona.goals());
    }
}