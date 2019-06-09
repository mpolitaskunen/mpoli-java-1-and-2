/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phonebook;

import java.util.Set;

/**
 *
 * @author seppo.taskunen
 */
public interface PhoneBookSearch {
    public void add(String name, String phonenumber);
    public Set<String> searchByName(String name);
    public String searchByPhoneNumber(String name);
    public void addAddress(String name, String address, String city);
    
    
}
