/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Counter {
    private int value;
    private boolean check;
    
    public Counter(int startingValue, boolean check) {
        this.value=startingValue;
        this.check=check;
    }
    
    public Counter(int startingValue){
        this.value=startingValue;
        this.check=false;
    }
    
    public Counter(boolean check) {
        this.value = 0;
        this.check= check;
    }
    
    public Counter() {
        this.value = 0;
        this.check = false;
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase(){
        this.value++;
    }
    
    public void increase(int increase){
        if(increase <= 0) {
            
        } else {
            this.value += increase;
        }
        
    }
        
    public void decrease() {
        if (this.check == true) {
            if (this.value <=0) {
                
            } else {
                this.value--;
            }
        } else {
            this.value--;
        }
    }
    
    public void decrease(int decrease) {
        if (this.check == true) {
            if (this.value-decrease <=0) {
                this.value=0;
            } else {
                if (decrease <= 0) {
                    
                } else {
                    this.value -= decrease;
                }
                
            }
        } else {
            if (decrease <= 0) {
                
            } else {
                this.value -= decrease;
            }
            
        }
    }
}
