package boxes;

import java.util.Objects;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {
        
        this.name = name;
        if(weight < 0 ) {
            throw new IllegalArgumentException("Weight cannot be negative!");
        } else {
            this.weight = weight;
        }
    }

    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        
        if(getClass() != o.getClass()) {
            return false;
        }
        
        Thing c = (Thing) o;
             
        if(this.name == null || !this.name.equals(c.getName())) {
            return false;
        }
        
        return true;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

}
