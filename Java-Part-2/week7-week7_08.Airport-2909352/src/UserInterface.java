import java.util.Scanner;
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
public class UserInterface {
    private Scanner reader;
    private Airport airport;
    
    public UserInterface(Scanner reader,Airport airport){
        this.reader = reader;
        this.airport = airport;
    }
    
    public void FlightService() {
        System.out.println("");
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print(">");
            String command = reader.nextLine();
            
            if(command.equals("x")) {
                System.out.println("");
                break;
            } else if (command.equals("1")){
                for(Airplane plane:this.airport.getPlanes()) {
                    System.out.println(plane.toString());
                } 
            } else if (command.equals("2")) {
                for(Flight flight:this.airport.getFlights()) {
                    System.out.println(flight.toString());
                }
            } else if (command.equals("3")) {
                System.out.print("Give plane ID: ");
                String nimi = reader.nextLine();
                Airplane plane = this.airport.selectPlane(nimi);
                System.out.println(plane.toString());
            }
        }
    }
    
    public void Airport(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while(true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print(">");
            String command = reader.nextLine();
            
            if(command.equals("x")) {
                break;
            } else if (command.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeid = reader.nextLine();
                System.out.print("Give plane capacity: ");
                int planecap = Integer.parseInt(reader.nextLine());
                this.airport.addPlane(new Airplane(planeid,planecap));
            } else if (command.equals("2")) {
                System.out.print("Give plane ID: ");
                String nimi = reader.nextLine();
                Airplane plane = this.airport.selectPlane(nimi);
                System.out.print("Give departure airport code: ");
                String depart = reader.nextLine();
                System.out.print("Give destination airport code: ");
                String desti = reader.nextLine();
                this.airport.addFlight(new Flight(plane,depart,desti));
            }
        }
        }
    
    public void start() {
        this.Airport();
        this.FlightService();
    }
}
