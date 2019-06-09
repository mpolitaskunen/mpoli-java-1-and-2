
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int totalPrice;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.totalPrice = squareMeters*pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment otherApartment) {
        int palautus=0;
        if(otherApartment.totalPrice > this.totalPrice) {
            palautus = otherApartment.totalPrice - this.totalPrice;
        } else {
            palautus = this.totalPrice - otherApartment.totalPrice;
        }
        
        return palautus;
        
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        if (this.totalPrice > otherApartment.totalPrice) {
            return true;
        } else {
            return false;
        }
    }
    
}
