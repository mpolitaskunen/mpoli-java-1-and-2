/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Flight {
    private String dep;
    private String dest;
    private Airplane plane;
    
    public Flight(Airplane plane, String dep, String dest) {
        this.dep = dep;
        this.dest = dest;
        this.plane = plane;
    }
    
    public String toString() {
        return this.plane.toString() + " (" + dep + "-" + dest + ")";
    }
}
