/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Natalie
 */
public class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
        public Product(String name, double price){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }   
    
    public Double getPrice(){
        return price;
    }   
    public void setPrice(double price){
        this.price = price;
    }
    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
        
    }
    public void addProduct(int quantity){
        this.quantity += quantity;
    }
    public void removeProduct(int quantity){
        this.quantity -= quantity; 
    }
    
    public String toString(){
        return  name 
                + ", $ "
                + String.format("%.2f", price)
                +", "
                + quantity
                + " units, Total: $"
                +String.format("%.2f", totalValueInStock());
                
                
    }

}