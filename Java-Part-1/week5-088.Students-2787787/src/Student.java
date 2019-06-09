/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Student {
    private String name;
    private String studentNumber;
    
    public Student(String nimi, String numero) {
        this.name = nimi;
        this.studentNumber = numero;
    }
    
    public String toString(){
        return this.name + " (" + this.studentNumber + ")"; 
    }
    
    public String getStudentNumber() {
        return this.studentNumber;
    }
    
    public String getName(){
        return this.name;
    }
}
