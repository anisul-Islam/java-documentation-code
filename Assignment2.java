/*
 * Assignment-2 (Variable and Data type)
 * step 1: create a class called Product
 * step 2: create a main method
 * step 3: declare variables: id, title, price, description, category
 * step 4: assign the following data in main method
101,iphone15,1895 euros,perfect product with best image quality, phone,
* step 5: print the data
 */



package sprite.varible;

public class Product {
    public static void main(String[] arge){
       int id = 101;
       String title = "iphone15"; 
       int price = 1895;
       String description = "perfect product with best image quality";
       String category = "phone";
       
       
       System.out.println("id: " + id);
       System.out.println("title: " + title);
       System.out.println("price: " + price + " euros");
       System.out.println("description: " + description);
       System.out.println("category: " + category);
    }
    
}
