/*
 * Assignment-3 (User Input)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: get user input for each variables
* step 5: print the variables
 */


import java.util.*;

public class Product {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Assign Product ID: ");
        int id = sc.nextInt();
        
        System.out.print("Assign Product Title: ");
        String title = sc.nextLine();
        
        System.out.print("Assign Product Price: ");
        double price = sc.nextDouble(); 
        
        System.out.print("Assign Product Description: ");
        String description = sc.nextLine(); 
        
        System.out.print("Assign Product Category: ");
        String category = sc.nextLine(); 
        
        System.out.println("id: " + id);
        System.out.println("title: " + title);
        System.out.println("price: " + price + " euros");
        System.out.println("description: " + description);
        System.out.println("category: " + category);
    }
}
