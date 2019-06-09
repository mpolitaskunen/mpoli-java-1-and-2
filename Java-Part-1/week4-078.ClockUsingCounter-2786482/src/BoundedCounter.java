/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class BoundedCounter {
        private int value;
        private int upperLimit;
        
        public BoundedCounter(int upperLimit) {
            // Code
           
            this.value = 0;
            this.upperLimit = upperLimit;
            
        }
        
        public void setValue(int value) {
            if (value < 0) {
                this.value = 0;
            } else {
                this.value = value;
            }
            
        }
        
        public void next() {
            // Code
            this.value++;
        }
        
        public String toString() {
            // Code
            if (this.value > this.upperLimit) {
                this.value = 0;
            }
            
            if (this.value < 10) {
                return "0" + this.value;
            } else {
                return "" + this.value;
            }
        }
        
        public int getValue() {
            if (this.value > this.upperLimit) {
                return 0;
            } else {
                return this.value;
            }
            
        }
}
