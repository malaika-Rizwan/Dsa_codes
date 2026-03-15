package doublylinkedlist;



import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Bookmanager bm = new Bookmanager();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== BOOK MENU =====");
            System.out.println("1. Add Book at Start");
            System.out.println("2. Add Book at End");
            System.out.println("3. Delete Book from Start");
            System.out.println("4. Delete Book from End");
            System.out.println("5. Search Book");
            System.out.println("6. Update Book");
            System.out.println("7. Display Books");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");

            int choice = s.nextInt();

            switch (choice) {
                case 1: bm.AddBook_Start(); break;
                case 2: bm.AddBook_End(); break;
                case 3: bm.deleteBook_Start(); break;
                case 4: bm.deleteBook_End(); break;
                case 5: bm.SearchBook(); break;
                case 6: bm.UpdateBook(); break;
                case 7: bm.display(); break;
                case 8:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
