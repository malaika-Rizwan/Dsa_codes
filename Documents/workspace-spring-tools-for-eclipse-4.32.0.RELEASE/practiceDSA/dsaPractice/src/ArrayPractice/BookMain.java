package ArrayPractice;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Books book = new Books();
        int choice;

        do {
            System.out.println("\n--- Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    book.searchBook();
                    break;
                case 3:
                    book.deleteBook();
                    break;
                case 4:
                    book.display();
                    break;
                case 5:
                    System.out.println(" Exiting program...");
                    break;
                default:
                    System.out.println("❌ Invalid choice! Try again.");
            }

        } while (choice != 5);

        s.close();
    }
}
