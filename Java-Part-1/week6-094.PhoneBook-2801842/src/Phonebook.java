import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();
    
    public Phonebook (){
        
    }
    
    public void add(String name, String number) {
        Person person = new Person(name,number);
        this.phonebook.add(person);
    }
    
    public void printAll() {
        for(Person person:this.phonebook) {
            System.out.println(person);
        }
    }
    
    public String searchNumber(String nimi){
        for(Person person:this.phonebook){
            
            String personnimi = person.getName();
            
            if(personnimi.contains(nimi)) {
                return person.getNumber();
            } 
        }
        return "number not known";
    }
}
