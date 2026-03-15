package doublylinkedlist;



import java.util.Scanner;

public class Bookmanager {
    Node head = null;
    Node tail = null;

    Scanner s = new Scanner(System.in);

    // ---------------- ADD BOOK AT START ----------------
    public void AddBook_Start() {
        System.out.print("Enter ID: ");
        int id = s.nextInt();
        s.nextLine();

        System.out.print("Enter Title: ");
        String title = s.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = s.nextLine();

        System.out.print("Enter Price: ");
        double price = s.nextDouble();

        Node newNode = new Node(id, title, publisher, price);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        System.out.println("Book added at START successfully.");
    }

    // ---------------- ADD BOOK AT END ----------------
    public void AddBook_End() {
        System.out.print("Enter ID: ");
        int id = s.nextInt();
        s.nextLine();

        System.out.print("Enter Title: ");
        String title = s.nextLine();

        System.out.print("Enter Publisher: ");
        String publisher = s.nextLine();

        System.out.print("Enter Price: ");
        double price = s.nextDouble();

        Node newNode = new Node(id, title, publisher, price);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Book added at END successfully.");
    }

    // ---------------- DELETE BOOK FROM START ----------------
    public void deleteBook_Start() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {  
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Book deleted from START successfully.");
    }

    // ---------------- DELETE BOOK FROM END ----------------
    public void deleteBook_End() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Book deleted from END successfully.");
    }

    // ---------------- SEARCH BOOK ----------------
    public void SearchBook() {
        System.out.print("Enter book ID to search: ");
        int id = s.nextInt();

        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.println("Book Found:");
                System.out.println("ID: " + temp.id);
                System.out.println("Title: " + temp.title);
                System.out.println("Publisher: " + temp.publisher);
                System.out.println("Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    // ---------------- UPDATE BOOK ----------------
    public void UpdateBook() {
        System.out.print("Enter book ID to update: ");
        int id = s.nextInt();
        s.nextLine();

        Node temp = head;
        while (temp != null) {
            if (temp.id == id) {
                System.out.print("New Title: ");
                temp.title = s.nextLine();

                System.out.print("New Publisher: ");
                temp.publisher = s.nextLine();

                System.out.print("New Price: ");
                temp.price = s.nextDouble();

                System.out.println("Book updated successfully.");
                return;
            }
            temp = temp.next;
        }

        System.out.println("Book not found.");
    }

    // ---------------- DISPLAY BOOKS ----------------
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        System.out.println("\n--- BOOK LIST ---");
        while (temp != null) {
            System.out.println("ID: " + temp.id);
            System.out.println("Title: " + temp.title);
            System.out.println("Publisher: " + temp.publisher);
            System.out.println("Price: " + temp.price);
            System.out.println("----------------------");
            temp = temp.next;
        }
    }
}
