
public class MyDate {

    public int day;
    public int month;
    public int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differneceInYears(MyDate compared) {
        int difference = 0;
        
        int vuosiA = this.year-1;
        int vuosiB = compared.year-1;
        
        int kuuA = (vuosiA*30*12)+(vuosiA*5);
        int kuuB = (vuosiB*30*12)+(vuosiB*5);
        
        int tama = ((this.month-1) * 30) + this.day;
        int tuo = ((compared.month-1) * 30) + compared.day;
        
        tama += kuuA;
        tuo += kuuB;
        
        int paivat = 0;
        
        if(tama > tuo) {
            paivat = tama-tuo;
        } else {
            paivat = tuo-tama;
        }
      
        difference = paivat/365;
        
        return difference;
    }

  
}