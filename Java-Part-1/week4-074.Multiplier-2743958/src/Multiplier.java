/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo
 */
public class Multiplier {
    private int a;
    
    public Multiplier(int number) {
        this.a = number;
    }
    
    public int multiply(int otherNumber) {
        int numero = this.a*otherNumber;
        return numero;
    }
    
}