/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class  Stars {
    public static String print(int count) {
        String output = "";
        for(int i=0; i < count; i++) {
            output += "*"; 
        }
        
        return output;
    }
}
