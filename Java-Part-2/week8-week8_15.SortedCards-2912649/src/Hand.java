import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for(Card kortti:this.hand) {
            System.out.println(kortti);
        }
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public ArrayList<Card> arrayOutput() {
        ArrayList<Card> temppi = new ArrayList<Card>();
        
        for(Card kortti:this.hand) {
            temppi.add(kortti);
        }
        
        return temppi;
    }
    
    @Override
    public int compareTo(Hand handu) {
        int hand1 = 0;
        int hand2 = 0;
        
        for(Card card1:this.hand) {
            hand1 += card1.getValue();
        }
        
        for(Card card2:handu.arrayOutput()) {
            hand2 += card2.getValue();
        }
        
        if(hand2 == hand1) {
            return 0;
        } else if(hand2 > hand1) {
            return -1;
        } else {
            return 1;
        }
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
