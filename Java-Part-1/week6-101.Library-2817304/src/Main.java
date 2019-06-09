import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // test your program here
        Library Library = new Library();

        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        for (Book book: Library.searchByTitle("CHEESE")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book: Library.searchByPublisher("PENGUIN  ")) {
            System.out.println(book);
        }
        
        Library k = new Library(); 
        Book book1 = new Book("Core Java", "Addison Wesley", 2001);
        Book book2 = new Book("Test Driven Development", "Addison Wesley", 2001);
        Book book3 = new Book("Java Poweruser Guide", "Prentice Hall", 2012);
        k.addBook(book1);
        k.addBook(book2);
        k.addBook(book3);
        k.searchByTitle("Java");
        
        for(Book book:k.searchByTitle("Java")){
            System.out.println(book);
        }
  
  
    }
}
