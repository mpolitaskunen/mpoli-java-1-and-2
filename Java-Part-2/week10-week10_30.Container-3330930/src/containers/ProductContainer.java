/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author Icedman
 */
public class ProductContainer extends Container{
    private String productName;
    
    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }
    
    public void setName(String name) {
        this.productName = name;
    }
    
    public String getName() {
        return this.productName;
    }
    
    @Override
    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
