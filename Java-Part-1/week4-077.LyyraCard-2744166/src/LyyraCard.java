/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + this.balance + " euros";
    }
    
    public void payEconomical () {
        if (this.balance < 2.5) {
            
        } else {
            this.balance -= 2.5;
        }
    }
    
    public void payGourmet() {
        if (this.balance < 4.0) {
            
        } else {
            this.balance -= 4.0;
        }
    }
    
    public void loadMoney(double amount) {
        if (amount < 0) {
            
        }else if (this.balance + amount > 150.0) {
            this.balance = 150.0;
        } else {
            this.balance += amount; 
        }
    }
    
    
}
