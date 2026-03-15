package abdullahcodes;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    Node head;

    // Insert at beginning
    public void insertBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    // Insert at any position
    public void insertAt(int pos, int value) {
        if (pos == 0) {
            insertBeginning(value);
            return;
        }
        Node newNode = new Node(value);
        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Update value
    public void update(int pos, int value) {
        Node temp = head;
        for (int i = 0; i < pos && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.data = value;
    }

    // Delete node
    public void delete(int pos) {
        if (pos == 0 && head != null) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null || temp.next == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        SinglyLinkedList s = new SinglyLinkedList();

        s.insertBeginning(10);
        s.insertEnd(20);
        s.insertAt(1, 99);
        s.update(1, 50);
        s.delete(2);

        s.display();
    }
}
