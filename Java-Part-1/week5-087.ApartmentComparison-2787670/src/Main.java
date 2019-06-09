
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Apartment studioManhattan = new Apartment(1, 16, 5500);
        Apartment twoRoomsBrooklyn = new Apartment(2, 38, 4200);
        Apartment fourAndKitchenBronx = new Apartment(3, 78, 2500);
        
        System.out.println("Manhattan studio is larger" + studioManhattan.larger(twoRoomsBrooklyn)); // False
        System.out.println("Four and Kitchen in bronx is larger" + fourAndKitchenBronx.larger(twoRoomsBrooklyn)); //True
        
        System.out.println("Studio vs Brooklyn is " + studioManhattan.priceDifference(twoRoomsBrooklyn));
        System.out.println("Four Bronx vs Two brooklyn" + fourAndKitchenBronx.priceDifference(twoRoomsBrooklyn));
        
        System.out.println("Studio is more expensive than Brooklyn" + studioManhattan.moreExpensiveThan(twoRoomsBrooklyn));
        System.out.println("Four Bronx is more expensive than brooklyn" + fourAndKitchenBronx.moreExpensiveThan(twoRoomsBrooklyn));
    }
}
