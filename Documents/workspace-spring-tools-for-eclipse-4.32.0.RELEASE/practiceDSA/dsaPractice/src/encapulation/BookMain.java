package encapulation;
import java.util.Scanner;

public class BookMain {
    private static Books[] bk = new Books[5];  // static array of fixed size
    private static int index = 0;
    private static Scanner s = new Scanner(System.in);

    public static void addBook() {
        if (index >= bk.length) {
            System.out.println("❌ Book shelf is full!");
            return;
        }

        Books b = new Books();
        System.out.print("Enter book id: ");
        b.setId(s.nextInt());
        s.nextLine(); // consume newline

        System.out.print("Enter title: ");
        b.setTitle(s.nextLine());

        System.out.print("Enter publisher: ");
        b.setPublisher(s.nextLine());

        System.out.print("Enter price: ");
        b.setPrice(s.nextDouble());

        bk[index] = b;
        index++;
        System.out.println("✅ Book added successfully!");
    }

    public static void searchBook() {
        if (index == 0) {
            System.out.println("❌ No books to search!");
            return;
        }

        System.out.print("Enter book id to search: ");
        int searchId = s.nextInt();
        boolean found = false;

        for (int i = 0; i < index; i++) {
            if (bk[i].getId() == searchId) {
                System.out.println("\n✅ Book Found:");
                System.out.println("ID: " + bk[i].getId());
                System.out.println("Title: " + bk[i].getTitle());
                System.out.println("Publisher: " + bk[i].getPublisher());
                System.out.println("Price: " + bk[i].getPrice());
                found = true;
                break;
            }
        }

        if (!found) System.out.println("❌ Book not found!");
    }

    public static void deleteBook() {
        if (index == 0) {
            System.out.println("❌ No books to delete!");
            return;
        }

        System.out.print("Enter book id to delete: ");
        int deleteId = s.nextInt();
        boolean found = false;

        for (int i = 0; i < index; i++) {
            if (bk[i].getId() == deleteId) {
                System.out.println("✅ Book deleted: " + bk[i].getTitle());
                for (int j = i; j < index - 1; j++) {
                    bk[j] = bk[j + 1];
                }
                bk[index - 1] = null;
                index--;
                found = true;
                break;
            }
        }

        if (!found) System.out.println("❌ Book not found!");
    }

    public static void displayAll() {
        if (index == 0) {
            System.out.println(" No books available!");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (int i = 0; i < index; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println("ID: " + bk[i].getId());
            System.out.println("Title: " + bk[i].getTitle());
            System.out.println("Publisher: " + bk[i].getPublisher());
            System.out.println("Price: " + bk[i].getPrice());
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n--- 📘 Book Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> deleteBook();
                case 4 -> displayAll();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("❌ Invalid choice!");
            }
        } while (choice != 5);
    }
}
