import java.util.HashMap;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if(this.owners.containsKey(plate)){
            return false;
        } else {
            this.owners.put(plate, owner);
            return true;
        }
    }
    
    public String get(RegistrationPlate plate) {
        if(this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        } else {
            return null;
        }
    }
    
    public String getOwner(RegistrationPlate plate) {
        return this.owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if(this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printRegistrationPlates() {
        for(RegistrationPlate key:this.owners.keySet()){
            System.out.println(key);
        }
    }
    
    public void printOwners() {
        String output = "";
        
        for(RegistrationPlate key:this.owners.keySet()) {
            if (!output.contains(this.owners.get(key))) {
                output += this.owners.get(key) + "\n";
            }
        }
        System.out.println(output);
    }
}
