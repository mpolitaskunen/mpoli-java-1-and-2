/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reference.domain;

/**
 *
 * @author seppo.taskunen
 */
public class Film {
    private String name;
    
    
    public Film(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    @Override
    public boolean equals(Object object) {
        if(object == null) {
            return false;
        }
        
        if(getClass() != object.getClass()) {
            return false;
        }
        
        Film compared = (Film) object;
        
        if(this.name != compared.getName()) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        if(this.name == null) {
            return 7;
        }
        
        return this.name.hashCode();
    }
    
}
