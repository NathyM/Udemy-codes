/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JOptionPane;


// JOptionPane.showInputDialog(" ");
/**
 *
 * @author Natalie
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name, price);
        
        System.out.println("");   
        System.out.println("Product data: " + product);
        System.out.println("");  
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println("");  
        System.out.println("Updated data: " + product);
        System.out.println("");  
        System.out.println("Enter the number of products to be removed from stock: ");  
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println("");  
        System.out.println("Updated data: " + product);
        sc.close();
        
    }
    
}
