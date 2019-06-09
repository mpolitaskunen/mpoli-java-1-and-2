import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // the method to deal with a customer in the shop
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            
            if(product.contains("coffee") && this.store.stock(product) > 0) {
                this.store.take(product);
                basket.add(product, 5);
            } else if (product.contains("milk") && this.store.stock(product) > 0) {
                this.store.take(product);
                basket.add(product, 3);
            } else if (product.contains("milkbutter") && this.store.stock(product) > 0) {
                this.store.take(product);
                basket.add(product, 2);
            } else if (product.contains("bread") && this.store.stock(product) > 0) {
                this.store.take(product);
                basket.add(product, 7);
            }

            // here, you write the code to add a product to the shopping basket, if the storehouse is not empty
            // and decreases the storehouse stocks
            // do not touch the rest of the code!

        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }    
}
