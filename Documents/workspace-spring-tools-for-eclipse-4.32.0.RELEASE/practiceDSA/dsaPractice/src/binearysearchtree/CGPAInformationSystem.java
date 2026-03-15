package binearysearchtree;
import java.util.Scanner;



public class CGPAInformationSystem {

    static StudentNode root = null;

   
    static StudentNode insert(StudentNode root, String name, double cgpa) {
        if (root == null) {
            return new StudentNode(name, cgpa);
        }

        if (cgpa < root.cgpa)
            root.left = insert(root.left, name, cgpa);
        else
            root.right = insert(root.right, name, cgpa);

        return root;
    }

   
    static void ascending(StudentNode root) {
        if (root != null) {
            ascending(root.left);
            System.out.println(root.name + " - CGPA: " + root.cgpa);
            ascending(root.right);
        }
    }

    
    static void descending(StudentNode root) {
        if (root != null) {
            descending(root.right);
            System.out.println(root.name + " - CGPA: " + root.cgpa);
            descending(root.left);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Ascending");
            System.out.println("3. Display Descending");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter CGPA: ");
                    double cgpa = sc.nextDouble();

                    root = insert(root, name, cgpa);
                    System.out.println("Student Added!");
                    break;

                case 2:
                    System.out.println("\nAscending Order:");
                    ascending(root);
                    break;

                case 3:
                    System.out.println("\nDescending Order:");
                    descending(root);
                    break;

                case 4:
                    System.out.println("Program Ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
