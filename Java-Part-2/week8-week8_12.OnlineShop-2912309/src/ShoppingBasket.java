import java.util.HashMap;
import java.util.Map;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class ShoppingBasket {
    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();
    
    public ShoppingBasket() {
    }
    
    public void add(String product, int price) {
        if(this.purchases.containsKey(product)) {
            this.purchases.get(product).increaseAmount();
        } else {
            this.purchases.put(product, new Purchase(product,1,price));
        }
    }
    
    public int price() {
        int price = 0;
        
        for(String key:this.purchases.keySet()) {
            price += this.purchases.get(key).price();
        }
        
        return price;
    }
    
    public void print() {
        for(String key:this.purchases.keySet()) {
            System.out.println(this.purchases.get(key));
        }
    }
}
