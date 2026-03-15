package ArrayPractice;

import java.util.Scanner;

public class DynamicArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DynamicArray da = new DynamicArray();

        while (true) {
            System.out.println("\n===== Dynamic Array Menu =====");
            System.out.println("1. Insert value at the end");
            System.out.println("2. Delete value by index");
            System.out.println("3. View elements");
            System.out.println("4. Insert value at the start");
            System.out.println("5. Insert value at a particular index");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert at end: ");
                    da.insertAtEnd(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter index to delete: ");
                    da.deleteByIndex(sc.nextInt());
                    break;
                case 3:
                    da.viewElements();
                    break;
                case 4:
                    System.out.print("Enter value to insert at start: ");
                    da.insertAtStart(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    da.insertAtIndex(idx, val);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }}

}
