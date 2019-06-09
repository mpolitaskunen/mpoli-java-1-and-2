import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name=name;
        this.birthday=birthday;
    }
    
    public Person(String name) {
        this.name=name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH)+1,Calendar.getInstance().get(Calendar.YEAR));
        int erotus = this.birthday.differneceInYears(today);
        return erotus;
    }
    
    public boolean olderThan(Person compared) {
        // compare the ages based on birthdays
        int vuosiA=this.birthday.year*365;
        int vuosiB=compared.birthday.year*365;
        int kuuA=this.birthday.month*30;
        int kuuB=compared.birthday.month*30;
        int tama=vuosiA+kuuA+this.birthday.day;
        int tuo=vuosiB+kuuB+compared.birthday.day;
        
        if(tuo > tama) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
