package personnel;

public class Main {

    public static void main(String[] args) {
        // write test code here
        /* Employees university = new Employees();
        university.add(new Person("Matti", Education.D));
        university.add(new Person("Pekka", Education.GRAD));
        university.add(new Person("Arto", Education.D));

        university.print();

        university.fire(Education.GRAD);

        System.out.println("==");

        university.print(); */
        Employees t = new Employees(); 
        Person h = new Person("Arto", Education.D); 
        
        t.add(h); 
        t.print();
        t.print(Education.D); 
    }
}
