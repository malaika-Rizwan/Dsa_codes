package paperPractice2;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Bookmanager bm = new Bookmanager();

        int choice = 0;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Book at Start");
            System.out.println("2. Add Book at End");
            System.out.println("3. Delete Book from Start");
            System.out.println("4. Delete Book from End");
            System.out.println("5. Search for Book");
            System.out.println("6. Update Book");
            System.out.println("7. Display Books");
            System.out.println("8. Exit");
            System.out.println("Enter Choice:");

            choice = s.nextInt();

            switch (choice) {
                case 1: bm.AddBook_Start(); break;
                case 2: bm.AddBook_End(); break;
                case 3: bm.deleteBook_Start(); break;
                case 4: bm.deleteBook_End(); break;
                case 5: bm.SearchBook(); break;
                case 6: bm.UpdateBook(); break;
                case 7: bm.display(); break;
                case 8: System.out.println("Exiting..."); break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 8);
    }
}
