public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
    
    public int differenceInYears(MyDate comparedDate) {
        int difference = 0;
        
        int vuosiA = this.year-1;
        int vuosiB = comparedDate.year-1;
        
        int kuuA = (vuosiA*30*12)+(vuosiA*5);
        int kuuB = (vuosiB*30*12)+(vuosiB*5);
        
        int tama = ((this.month-1) * 30) + this.day;
        int tuo = ((comparedDate.month-1) * 30) + comparedDate.day;
        
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
