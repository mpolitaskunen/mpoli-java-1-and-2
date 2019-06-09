/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Calculator {
    private int calculations;
    
    private Reader a = new Reader();
    
    public Calculator (){
    }
    
    public void start() {
        while(true) {
            System.out.print("command: ");
            String command = this.a.readString(); 
            
            if(command.equals("end")) {
                break;
            }
            
            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        
        statistics();
    }
    
    private void sum() {
        System.out.print("value1: ");
        int val1 = this.a.readInteger();
        System.out.print("value2: ");
        int val2 = this.a.readInteger();
        
        this.calculations += 1;
        
        System.out.println("sum of the values " + (val1+val2));
    }
    
    private void difference() {
        System.out.print("value1: ");
        int val1 = this.a.readInteger();
        System.out.print("value2: ");
        int val2 = this.a.readInteger();
        
        this.calculations += 1;
        
        System.out.println("difference of the values " + (val1-val2));
    }
    
    private void product() {
        System.out.print("value1: ");
        int val1 = this.a.readInteger();
        System.out.print("value2: ");
        int val2 = this.a.readInteger();
        
        this.calculations += 1;
        
        System.out.println("product of the values " + (val1*val2));
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.calculations);
    }
}
