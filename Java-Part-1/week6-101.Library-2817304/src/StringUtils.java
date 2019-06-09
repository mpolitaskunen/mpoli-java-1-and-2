/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class StringUtils {
    
    
    public static boolean included(String word, String searched){
        String temppi1 = word.toUpperCase();
        String temppi2 = searched.toUpperCase();
        String temppi3 = temppi2.trim();
        
        
       
        
        if(temppi1.contains(temppi3)) {
            return true;
        } else {
            return false;
        }
    }
    
}
