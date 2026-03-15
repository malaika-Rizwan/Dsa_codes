package assigmentdsa1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter total number of present students: ");
        int n = sc.nextInt();
        int[] rolls = new int[100]; 
        System.out.println("Enter roll numbers of present students:");
        for (int i = 0; i < n; i++) {
            rolls[i] = sc.nextInt();
        }

        while (true) {
            System.out.println("\n===== Attendance Menu =====");
            System.out.println("1. Insert a new student roll number");
            System.out.println("2. Delete a student roll number");
            System.out.println("3. Display attendance list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                  
                    System.out.print("Enter roll number to insert: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter position (0-based index): ");
                    int pos = sc.nextInt();

                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = n; i > pos; i--) {
                            rolls[i] = rolls[i - 1]; // shift right
                        }
                        rolls[pos] = roll;
                        n++;
                        System.out.println("Roll number inserted successfully.");
                    }
                    break;

                case 2:
                   
                    System.out.print("Enter roll number to delete: ");
                    int del = sc.nextInt();
                    int index = -1;
                    for (int i = 0; i < n; i++) {
                        if (rolls[i] == del) {
                            index = i;
                            break;
                        }
                    }
                    if (index == -1) {
                        System.out.println("Roll number not found!");
                    } else {
                        for (int i = index; i < n - 1; i++) {
                            rolls[i] = rolls[i + 1]; 
                        }
                        n--;
                        System.out.println("Roll number deleted successfully.");
                    }
                    break;

                case 3:
                   
                    System.out.println("Final Attendance List:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(rolls[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
