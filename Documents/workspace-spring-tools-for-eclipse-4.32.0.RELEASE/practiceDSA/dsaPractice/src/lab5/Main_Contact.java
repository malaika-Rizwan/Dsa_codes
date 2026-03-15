package lab5;

import java.util.Scanner;

class Contact {
    int Contact_id;
    String name;
    String phone;

    public Contact(int Contact_id, String name, String phone) {
        this.Contact_id = Contact_id;
        this.name = name;
        this.phone = phone;
    }
}

class Node {
    Contact data;
    Node next;

    public Node(Contact data) {
        this.data = data;
        this.next = null;
    }
}

public class Main_Contact {
    Node head = null;

    // ✅ Insert a new contact at the end
    public void insert(Contact data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // ✅ Delete a contact by ID
    public void delete(int ID) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data.Contact_id == ID) {
            head = head.next;
            System.out.println("Contact removed.");
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data.Contact_id != ID) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Contact not found.");
            return;
        }

        temp.next = temp.next.next;
        System.out.println("Contact removed.");
    }

    // ✅ Display all contacts
    public void display() {
        if (head == null) {
            System.out.println("No contacts to display.");
            return;
        }

        Node temp = head;
        System.out.println("\nAll Contacts:");
        System.out.println("------------------------------------------------");
        while (temp != null) {
            System.out.println("ID: " + temp.data.Contact_id + " | Name: " + temp.data.name + " | Phone: " + temp.data.phone);
            temp = temp.next;
        }
        System.out.println("------------------------------------------------\n");
    }

    // ✅ Main menu
    public static void main(String[] args) {
        Main_Contact contactList = new Main_Contact();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("=== Contact Management System ===");
            System.out.println("1. Insert Contact");
            System.out.println("2. Delete Contact");
            System.out.println("3. Display All Contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Contact ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    contactList.insert(new Contact(id, name, phone));
                    System.out.println("Contact added successfully!\n");
                    break;

                case 2:
                    System.out.print("Enter Contact ID to delete: ");
                    int delId = sc.nextInt();
                    contactList.delete(delId);
                    System.out.println();
                    break;

                case 3:
                    contactList.display();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        } while (choice != 4);

        sc.close();
    }
}
