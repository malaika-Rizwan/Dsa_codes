package ArrayPractice;

import java.util.Scanner;

public class ProductCatalog {
	 int index = 0;
	  Product[] pc = new Product[5]; 
	 Scanner s = new Scanner(System.in);

	public void addProduct() {
		if (index >= pc.length) {
	        System.out.println("product limit full you cannot add any product.");
	        return;
	    }

	    pc[index] = new Product();

	    System.out.println("Enter Product id:");
	    pc[index].id = s.nextInt();
	    s.nextLine(); 

	    System.out.println("Enter Product name:");
	    pc[index].name = s.nextLine();

	    System.out.println("Enter Product description:");
	    pc[index].description = s.nextLine();

	    System.out.println("Enter Product price:");
	    pc[index].price = s.nextDouble();

	    index++;
	    System.out.println("Product added successfully!");
		
		
		}
	public void searchProduct() {
		  if (index == 0) {
	          System.out.println(" No Product to search!");
	          return;
	      }

	      System.out.println("Enter Product id to search:");
	      int searchPId = s.nextInt();
	      boolean found = false;

	      for (int i = 0; i < index; i++) {
	          if (pc[i].id == searchPId) {
	              System.out.println("\n Product Found:");
	              System.out.println("ID: " + pc[i].id);
	              System.out.println("Title: " + pc[i].name);
	              System.out.println("Publisher: " + pc[i].description);
	              System.out.println("Price: " + pc[i].price);
	              found = true;
	              break;
	          }
	      }

	      if (!found) {
	          System.out.println("Product not found!");
	      }}
	      public void displayProduct() {
	    	  if (index == 0) {
	              System.out.println("No Products available!");
	              return;
	          }

	          System.out.println("\n--- Product List ---");
	          for (int i = 0; i < index; i++) {
	              System.out.println("\nProduct " + (i + 1));
	              System.out.println("ID: " + pc[i].id);
	              System.out.println("name: " + pc[i].name);
	              System.out.println("description: " + pc[i].description);
	              System.out.println("Price: " + pc[i].price);
	  		
	  	}
		
	}



	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 ProductCatalog p=new ProductCatalog();
	        int choice;

	        do {
	            System.out.println("\n--- Shop managment system ---");
	            System.out.println("1. Add Product");
	            System.out.println("2. Search Product");
	            System.out.println("3. Display All Products");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            choice = s.nextInt();

	            switch (choice) {
	                case 1:
	                   p.addProduct();
	                    break;
	                case 2:
	                    p.searchProduct();
	                    break;
	                case 3:
	                   p.displayProduct();
	                    break;
	          
	                case 4:
	                    System.out.println(" Exiting program...");
	                    break;
	                default:
	                    System.out.println("❌ Invalid choice! Try again.");
	            }

	        } while (choice != 4);

	        s.close();

	}

}
