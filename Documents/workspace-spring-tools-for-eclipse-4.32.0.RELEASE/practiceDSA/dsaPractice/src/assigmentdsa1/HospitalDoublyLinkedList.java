package assigmentdsa1;

import java.util.Scanner;

class PatientNode {
    int id;
    String name;
    String disease;
    PatientNode next, prev;

    public PatientNode(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }
}

public class HospitalDoublyLinkedList {
    private PatientNode head;

    public void createInitialList() {
        PatientNode p1 = new PatientNode(1, "Ali", "Flu");
        PatientNode p2 = new PatientNode(2, "Sara", "Fever");
        PatientNode p3 = new PatientNode(3, "Ahmed", "Cold");

        head = p1;
        p1.next = p2; p2.prev = p1;
        p2.next = p3; p3.prev = p2;
    }

    public void insertAtBeginning(PatientNode newP) {
        if (head == null) {
            head = newP;
        } else {
            newP.next = head;
            head.prev = newP;
            head = newP;
        }
    }

    public void insertAtEnd(PatientNode newP) {
        if (head == null) {
            head = newP;
            return;
        }
        PatientNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newP;
        newP.prev = temp;
    }

    public void insertAtPosition(PatientNode newP, int pos) {
        if (pos == 0) {
            insertAtBeginning(newP);
            return;
        }
        PatientNode temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newP.next = temp.next;
        if (temp.next != null)
            temp.next.prev = newP;
        temp.next = newP;
        newP.prev = temp;
    }

    public void deleteById(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.id == id) {
            head = head.next;
            if (head != null)
                head.prev = null;
            System.out.println("Patient with ID " + id + " deleted.");
            return;
        }
        PatientNode temp = head;
        while (temp != null && temp.id != id) temp = temp.next;

        if (temp == null) {
            System.out.println("Patient not found!");
        } else {
            if (temp.next != null)
                temp.next.prev = temp.prev;
            if (temp.prev != null)
                temp.prev.next = temp.next;
            System.out.println("Patient with ID " + id + " deleted.");
        }
    }


    public void searchByName(String name) {
        PatientNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Patient Found:");
                System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Disease: " + temp.disease);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("Patient with name " + name + " not found.");
    }


    public void displayForward() {
        if (head == null) {
            System.out.println("No records!");
            return;
        }
        PatientNode temp = head;
        System.out.println("\n--- Patient Records (Forward) ---");
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Disease: " + temp.disease);
            temp = temp.next;
        }
    }

  
    public void displayBackward() {
        if (head == null) return;
        PatientNode temp = head;
        while (temp.next != null) temp = temp.next; 

        System.out.println("\n--- Patient Records (Reverse) ---");
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Disease: " + temp.disease);
            temp = temp.prev;
        }
    }

   
    public static void main(String[] args) {
        HospitalDoublyLinkedList hms = new HospitalDoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        hms.createInitialList();

        while (true) {
            System.out.println("\n===== Hospital Management Menu =====");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Specific Position");
            System.out.println("4. Delete by Patient ID");
            System.out.println("5. Search by Name");
            System.out.println("6. Display Forward");
            System.out.println("7. Display Reverse");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: case 2: case 3:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String dis = sc.nextLine();
                    PatientNode newP = new PatientNode(id, name, dis);

                    if (choice == 1) hms.insertAtBeginning(newP);
                    else if (choice == 2) hms.insertAtEnd(newP);
                    else {
                        System.out.print("Enter position: ");
                        int pos = sc.nextInt();
                        hms.insertAtPosition(newP, pos);
                    }
                    break;
                case 4:
                    System.out.print("Enter Patient ID to delete: ");
                    hms.deleteById(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Name to search: ");
                    String n = sc.nextLine();
                    hms.searchByName(n);
                    break;
                case 6:
                    hms.displayForward();
                    break;
                case 7:
                    hms.displayBackward();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
