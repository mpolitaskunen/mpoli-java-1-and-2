/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnel;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author seppo.taskunen
 */
public class Employees {
    private List<Person> persons;
    
    public Employees() {
        this.persons = new ArrayList<Person>();
    }
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public void add(List<Person> persons) {
        Iterator<Person> per = persons.iterator();
        
        while(per.hasNext()){
            this.add(per.next());
        }
    }
    
    public void print() {
        Iterator<Person> per = this.persons.iterator();
        
        while(per.hasNext()) {
            System.out.println(per.next());
        }
    }
    
    public void print(Education education) {
        Iterator<Person> per = this.persons.iterator();
        
        while(per.hasNext()) {
            Person p = per.next();
            if(p.getEducation().equals(education)) {
                System.out.println(p);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> per = this.persons.iterator();
        while(per.hasNext()) {
            if(per.next().getEducation().equals(education)) {
                per.remove();
            }
        }
    }
}
