package assigmentdsa1;

import java.util.Scanner;


class Patient {
    int id;
    String name;
    String disease;
    Patient next;

    public Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.next = null;
    }
}

public class Question3 {
    private Patient head;

 
    public void createInitialList() {
        Patient p1 = new Patient(1, "Ali", "Flu");
        Patient p2 = new Patient(2, "Sara", "Fever");
        Patient p3 = new Patient(3, "Ahmed", "Cold");

        head = p1;
        p1.next = p2;
        p2.next = p3;
    }


    public void insertAtBeginning(Patient newPatient) {
        newPatient.next = head;
        head = newPatient;
    }


    public void insertAtEnd(Patient newPatient) {
        if (head == null) {
            head = newPatient;
            return;
        }
        Patient temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newPatient;
    }

 
    public void insertAtPosition(Patient newPatient, int position) {
        if (position == 0) {
            insertAtBeginning(newPatient);
            return;
        }
        Patient temp = head;
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }
        newPatient.next = temp.next;
        temp.next = newPatient;
    }


    public void deleteById(int id) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.id == id) {
            head = head.next;
            System.out.println("Patient with ID " + id + " deleted.");
            return;
        }
        Patient temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Patient ID not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Patient with ID " + id + " deleted.");
        }
    }

    // Search by name
    public void searchByName(String name) {
        Patient temp = head;
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

 
    public void displayAll() {
        if (head == null) {
            System.out.println("No patient records found!");
            return;
        }
        Patient temp = head;
        System.out.println("\n--- Patient Records ---");
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Disease: " + temp.disease);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Question3 hms = new Question3();
        Scanner sc = new Scanner(System.in);

        hms.createInitialList();

        while (true) {
            System.out.println("\n===== Hospital Management Menu =====");
            System.out.println("1. Insert Patient at Beginning");
            System.out.println("2. Insert Patient at End");
            System.out.println("3. Insert Patient at Specific Position");
            System.out.println("4. Delete Patient by ID");
            System.out.println("5. Search Patient by Name");
            System.out.println("6. Display All Patients");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();
                    Patient newP = new Patient(id, name, disease);

                    if (choice == 1)
                        hms.insertAtBeginning(newP);
                    else if (choice == 2)
                        hms.insertAtEnd(newP);
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
                    System.out.print("Enter Patient Name to search: ");
                    String searchName = sc.nextLine();
                    hms.searchByName(searchName);
                    break;

                case 6:
                    hms.displayAll();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
