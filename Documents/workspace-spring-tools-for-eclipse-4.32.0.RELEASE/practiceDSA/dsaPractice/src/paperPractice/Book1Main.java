package paperPractice;

import java.util.Scanner;

public class Book1Main {
	  public static void main(String[] args) {
		  Book1 bb=new Book1();
		  int choice;

	        do {
	            System.out.println("\n--- Book Management System ---");
	            System.out.println("1. Add Book");
	            System.out.println("2. Search Book");
	            System.out.println("3. Delete Book");
	            System.out.println("4. Display All Books");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	          Scanner s=new Scanner(System.in);
				choice = s.nextInt();

	            switch (choice) {
	                case 1:
	                    bb.addBook();
	                    break;
	                case 2:
	                    bb.searchBook();
	                    break;
	                case 3:
	                	System.out.println("enter book id to delete");
	            		int deleteid=s.nextInt();
	                    bb.deleteBook(deleteid);
	                    break;
	                case 4:
	                    bb.display();
	                    break;
	                case 5:
	                    System.out.println(" Exiting program...");
	                    break;
	                default:
	                    System.out.println("❌ Invalid choice! Try again.");
	            }

	        } while (choice != 5);

		
		 
	  }

}
