import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class Scores {
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private ArrayList<Integer> grade5 = new ArrayList<Integer>();
    private ArrayList<Integer> grade4 = new ArrayList<Integer>();
    private ArrayList<Integer> grade3 = new ArrayList<Integer>();
    private ArrayList<Integer> grade2 = new ArrayList<Integer>();
    private ArrayList<Integer> grade1 = new ArrayList<Integer>();
    private ArrayList<Integer> grade0 = new ArrayList<Integer>();
    
    public Scores() {
        
    }
    
    public void addNumber(int number) {
        this.scores.add(number);
        
        if (number <= 29) {
            this.grade0.add(number);
        } else if (number <= 34) {
            this.grade1.add(number);
        } else if (number <= 39) {
            this.grade2.add(number);
        } else if (number <= 44) {
            this.grade3.add(number);
        } else if (number <= 49) {
            this.grade4.add(number);
        } else if (number <= 60) {
            this.grade5.add(number);
        }
    }
    
    public void distribution() {
        int passed = this.scores.size()-this.grade0.size();
        int g5 = this.grade5.size();
        int g4 = this.grade4.size();
        int g3 = this.grade3.size();
        int g2 = this.grade2.size();
        int g1 = this.grade1.size();
        int g0 = this.grade0.size();
        
        double acceptance = 100 * passed/(double)this.scores.size();
        
        System.out.println("Grade distribution: ");
        System.out.println("5: " + Stars.print(g5));
        System.out.println("4: " + Stars.print(g4));
        System.out.println("3: " + Stars.print(g3));
        System.out.println("2: " + Stars.print(g2));
        System.out.println("1: " + Stars.print(g1));
        System.out.println("0: " + Stars.print(g0));
        System.out.println("Acceptance percentage: " + acceptance);
    }
    
    
    
    
}
