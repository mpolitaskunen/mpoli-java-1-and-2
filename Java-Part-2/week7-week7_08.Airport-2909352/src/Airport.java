import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Airport {
    private ArrayList<Airplane> planes;
    private ArrayList<Flight> flights;
    
    public Airport(){
        this.planes = new ArrayList<Airplane>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void addPlane(Airplane plane) {
        this.planes.add(plane);
    }
    
    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }
    
    public ArrayList<Airplane> getPlanes() {
        return this.planes;
    }
    
    public ArrayList<Flight> getFlights() {
        return this.flights;
    }
    
    public Airplane selectPlane(String id) {
        for(Airplane plane: planes) {
            if(plane.planeId().equals(id)) {
                return plane;
            }
        }
        return null;
    }
}
