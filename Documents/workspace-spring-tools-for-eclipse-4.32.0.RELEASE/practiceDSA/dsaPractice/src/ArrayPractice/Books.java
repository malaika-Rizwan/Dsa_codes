package ArrayPractice;

import java.util.Scanner;

public class Books {
    int id;
    String title;
    String publisher;
    double price;
    static int index = 0;
    static Books[] bk = new Books[5]; // static array, max 5 books
    Scanner s = new Scanner(System.in);

    // Add a new book
    public void addBook() {
        if (index >= bk.length) {
            System.out.println("❌ Book shelf is full! Cannot add more books.");
            return;
        }

        bk[index] = new Books();

        System.out.println("Enter book id:");
        bk[index].id = s.nextInt();
        s.nextLine(); // consume newline

        System.out.println("Enter title:");
        bk[index].title = s.nextLine();

        System.out.println("Enter publisher:");
        bk[index].publisher = s.nextLine();

        System.out.println("Enter price:");
        bk[index].price = s.nextDouble();

        index++;
        System.out.println("✅ Book added successfully!");
    }

    // Search for a book by ID
    public void searchBook() {
        if (index == 0) {
            System.out.println("❌ No books to search!");
            return;
        }

        System.out.println("Enter book id to search:");
        int searchId = s.nextInt();
        boolean found = false;

        for (int i = 0; i < index; i++) {
            if (bk[i].id == searchId) {
                System.out.println("\n✅ Book Found:");
                System.out.println("ID: " + bk[i].id);
                System.out.println("Title: " + bk[i].title);
                System.out.println("Publisher: " + bk[i].publisher);
                System.out.println("Price: " + bk[i].price);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Book not found!");
        }
    }

    // Delete book by ID
    public void deleteBook() {
        if (index == 0) {
            System.out.println("❌ No books to delete!");
            return;
        }

        System.out.println("Enter book id to delete:");
        int deleteId = s.nextInt();
        boolean found = false;

        for (int i = 0; i < index; i++) {
            if (bk[i].id == deleteId) {
                System.out.println("✅ Book deleted: " + bk[i].title);

                // shift remaining books to fill gap
                for (int j = i; j < index - 1; j++) {
                    bk[j] = bk[j + 1];
                }

                bk[index - 1] = null;
                index--;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Book not found!");
        }
    }

    // Display all books
    public void display() {
        if (index == 0) {
            System.out.println("📚 No books available!");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (int i = 0; i < index; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println("ID: " + bk[i].id);
            System.out.println("Title: " + bk[i].title);
            System.out.println("Publisher: " + bk[i].publisher);
            System.out.println("Price: " + bk[i].price);
        }
    }
}
