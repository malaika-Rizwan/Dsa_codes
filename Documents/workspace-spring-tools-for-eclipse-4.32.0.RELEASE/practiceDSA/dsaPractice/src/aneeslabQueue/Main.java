package aneeslabQueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProcessScadule scheduler = new ProcessScadule(10);

        while (true) {
            System.out.println("\n--- Priority-Based Process Scheduler ---");
            System.out.println("1. Add Process");
            System.out.println("2. Execute Next Process");
            System.out.println("3. View Pending Processes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter process name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter priority: ");
                    int priority = sc.nextInt();

                    scheduler.addProcess(new Process(name, priority));
                    break;

                case 2:
                    scheduler.executeNextProcess();
                    break;

                case 3:
                    scheduler.viewPendingProcesses();
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
