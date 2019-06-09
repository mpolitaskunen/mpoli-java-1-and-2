import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author seppo.taskunen
 */
public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stock;
        
    public Storehouse(){
        this.prices = new HashMap<String,Integer>();
        this.stock = new HashMap<String,Integer>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product,price);
        this.stock.put(product,stock);
    }
    
    public int price(String product) {
        if(!this.stock.containsKey(product) || this.stock.get(product) < 1) {
            return -99;
        } else {
            return this.prices.get(product);
        }
    }
    
    public int stock(String product) {
        if(!this.stock.containsKey(product)){
            return 0;
        } else {
            return this.stock.get(product);
        }
    }
    
    public boolean take(String product) {
        if(!this.stock.containsKey(product)) {
            return false;
        }
        
        if(this.stock.get(product)>0) {
            int temppi = this.stock.get(product);
            this.stock.put(product, temppi-1);
            return true;
        } else {
            return false;
        }
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<String>();
        
        for(String key:this.prices.keySet()) {
            products.add(key);
        }
        
        return products;
    }
}
