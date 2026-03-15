package paperPractice2;

import java.util.Scanner;

public class Bookmanager {

    Node head = null;
    Scanner s = new Scanner(System.in);

    // Add book at start
    public void AddBook_Start() {

        System.out.println("Enter ID:");
        int id = s.nextInt();
        s.nextLine();

        System.out.println("Enter Title:");
        String title = s.nextLine();

        System.out.println("Enter Publisher:");
        String publisher = s.nextLine();

        System.out.println("Enter Price:");
        Double price = s.nextDouble();

        Node newnode = new Node(id, title, publisher, price);

        newnode.next = head; // correct linking
        head = newnode;

        System.out.println("Book added to START successfully");
    }

    // Add book at end
    public void AddBook_End() {

        System.out.println("Enter ID:");
        int id = s.nextInt();
        s.nextLine();

        System.out.println("Enter Title:");
        String title = s.nextLine();

        System.out.println("Enter Publisher:");
        String publisher = s.nextLine();

        System.out.println("Enter Price:");
        Double price = s.nextDouble();

        Node newnode = new Node(id, title, publisher, price);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {  // FIXED
                temp = temp.next;
            }
            temp.next = newnode;
        }

        System.out.println("Book added to END successfully");
    }

    // Delete start
    public void deleteBook_Start() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        System.out.println("Book deleted from START");
    }

    // Delete end
    public void deleteBook_End() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;

            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        System.out.println("Book deleted from END");
    }

    // Search book by id
    public void SearchBook() {
        System.out.println("Enter ID to search:");
        int id = s.nextInt();

        Node temp = head;

        while (temp != null) {  // FIXED
            if (temp.id == id) {
                System.out.println("\nBook FOUND:");
                System.out.println("ID: " + temp.id);
                System.out.println("Title: " + temp.title);
                System.out.println("Publisher: " + temp.publisher);
                System.out.println("Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book NOT found");
    }

    // Update book
    public void UpdateBook() {
        System.out.println("Enter ID to update:");
        int id = s.nextInt();
        s.nextLine();

        Node temp = head;

        while (temp != null) {  // FIXED
            if (temp.id == id) {

                System.out.println("Enter NEW ID:");
                temp.id = s.nextInt();
                s.nextLine();

                System.out.println("Enter NEW Title:");
                temp.title = s.nextLine();

                System.out.println("Enter NEW Publisher:");
                temp.publisher = s.nextLine();

                System.out.println("Enter NEW Price:");
                temp.price = s.nextDouble();

                System.out.println("Book UPDATED successfully");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book NOT found for update");
    }

    // Display all books
    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        System.out.println("\n----- BOOK LIST -----");

        while (temp != null) {  // FIXED
            System.out.println("ID: " + temp.id);
            System.out.println("Title: " + temp.title);
            System.out.println("Publisher: " + temp.publisher);
            System.out.println("Price: " + temp.price);
            System.out.println("-------------------------");
            temp = temp.next;
        }
    }
}
