
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int a = this.euros()+added.euros();
        int b = this.cents()+added.cents();
        return new Money(a,b);
    }
    
    public boolean less(Money compared) {
        if(this.euros() > compared.euros()) {
            return false;
        } else if(this.euros() == compared.euros() && this.cents() > compared.cents()) {
            return false; 
        } else {
            return true;
        }
    }
    
    public Money minus(Money decremented) {
        int a = this.euros() - decremented.euros();
        int b = 0;
        
        if(this.cents < decremented.euros) {
            b=this.cents - decremented.cents + 100;
            a--;
        } else {
            b=this.cents-decremented.euros;
        }
        
        
        
        if(a < 0) {
            a=0;
            b=0;
        } else if (a==0 && b<0) {
            a=0;
            b=0;
        } 
        return new Money(a,b);
    }

}
