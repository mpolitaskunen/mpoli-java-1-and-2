/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author seppo.taskunen
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void manageCows() {
        this.barn.takeCareOf(cows);
    }
    
    @Override
    public void liveHour() {
        for(Cow c:this.cows) {
            c.liveHour();
        }
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    @Override
    public String toString() {
        String cows = "";
        
        if(this.cows.isEmpty()) {
            cows = "No animals";
        } else {
            cows = "Animals:\n";
            for(Cow c:this.cows) {
                cows += "        " + c.toString() + "\n";
            }
        }
        
        return "Farm owner: " + this.getOwner() + 
             "\nBarn bulk tank: " + this.barn.getBulkTank() +
             "\n" + cows;
    }
    
}
