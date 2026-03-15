package ArrayPractice;

import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AdmissionForm form = new AdmissionForm();

        while (true) {
            System.out.println("\n===== Admission Form Menu =====");
            System.out.println("1. Add a Student");
            System.out.println("2. Add a Student at Specific Position");
            System.out.println("3. Update Student Data (Using Roll Number)");
            System.out.println("4. Delete a Student (Using Roll Number)");
            System.out.println("5. Delete a Student (Using Position)");
            System.out.println("6. View All Students");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student s1 = inputStudent(sc);
                    form.addStudent(s1);
                    break;
                case 2: 
                    System.out.print("Enter position (0-based index): ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    Student s2 = inputStudent(sc);
                    form.addStudentAt(pos, s2);
                    break;
                case 3:
                    System.out.print("Enter roll number to update: ");
                    int r = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter new details:");
                    System.out.print("Name: "); String name = sc.nextLine();
                    System.out.print("Age: "); int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Department: "); String dept = sc.nextLine();
                    System.out.print("CGPA: "); double cgpa = sc.nextDouble();
                    form.updateStudent(r, name, age, dept, cgpa);
                    break;
                case 4:
                    System.out.print("Enter roll number to delete: ");
                    form.deleteStudentByRoll(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter index to delete: ");
                    form.deleteStudentByIndex(sc.nextInt());
                    break;
                case 6:
                    form.viewStudents();
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    // Helper function to input student details
    private static Student inputStudent(Scanner sc) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department: ");
        String dept = sc.nextLine();
        System.out.print("Enter CGPA: ");
        double cgpa = sc.nextDouble();
        sc.nextLine();
        return new Student(name, roll, age, dept, cgpa);
    }
}
 