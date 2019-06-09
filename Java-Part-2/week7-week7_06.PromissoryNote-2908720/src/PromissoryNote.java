import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class PromissoryNote {
    private HashMap<String,Double> laina;
       
    
    public PromissoryNote() {
        this.laina = new HashMap<String, Double>();
    }
    
    public void setLoan(String toWhom, double value) {
        this.laina.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose){
        if(this.laina.containsKey(whose)) {
            return this.laina.get(whose);
        } else {
            return 0;
        }
    }
}
