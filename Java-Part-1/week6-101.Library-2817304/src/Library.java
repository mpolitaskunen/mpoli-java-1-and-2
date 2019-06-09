import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icedman
 */
public class Library {
    private ArrayList<Book> kirjasto = new ArrayList<Book>();
    
    public Library() {
        
    }
    
    public void addBook(Book newBook) {
        this.kirjasto.add(newBook);
    }
    
    public void printBooks() {
        for(Book book:this.kirjasto) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
    ArrayList<Book> found = new ArrayList<Book>();

    // iterate the list of books and add all the matching books to the list found
    
    for(Book kirja:this.kirjasto) {
            if(StringUtils.included(kirja.title(), title)) {
                found.add(kirja);
            }
    }

    return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book kirja:this.kirjasto){
            if(StringUtils.included(kirja.publisher(), publisher)) {
                found.add(kirja);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book kirja:this.kirjasto){
            int vuosi=kirja.year();
            if(vuosi==year){
                found.add(kirja);
            }
        }
        
        return found;
    }
    
}
