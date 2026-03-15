package sirAneesLab;
import java.util.Scanner;





class IntegerLinkedList {
    private Node head;


    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            System.out.println(value + " inserted as the first element.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        System.out.println(value + " inserted at the end of the list.");
    }

 
    public void update(int target, int newValue) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                current.data = newValue;
                System.out.println("Value " + target + " updated to " + newValue + ".");
                return;
            }
            current = current.next;
        }
        System.out.println("Value " + target + " not found in the list.");
    }


    public int search(int target) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }


    public void printList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerLinkedList list = new IntegerLinkedList();
        int choice;

        do {
            System.out.println("\n==== Integer LinkedList Menu ====");
            System.out.println("1. Insert Value");
            System.out.println("2. Update Value");
            System.out.println("3. Search Value");
            System.out.println("4. Print List");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int val = sc.nextInt();
                    list.insert(val);
                    break;

                case 2:
                    System.out.print("Enter target value to update: ");
                    int target = sc.nextInt();
                    System.out.print("Enter new value: ");
                    int newValue = sc.nextInt();
                    list.update(target, newValue);
                    break;

                case 3:
                    System.out.print("Enter value to search: ");
                    int searchVal = sc.nextInt();
                    int index = list.search(searchVal);
                    if (index != -1)
                        System.out.println("Value found at index: " + index);
                    else
                        System.out.println("Value not found in the list.");
                    break;

                case 4:
                    list.printList();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
