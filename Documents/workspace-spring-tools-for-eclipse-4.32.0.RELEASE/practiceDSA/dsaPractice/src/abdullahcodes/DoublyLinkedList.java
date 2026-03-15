package abdullahcodes;

class DNode {
    int data;
    DNode next, prev;

    public DNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedList {

    DNode head;

    // Insert at beginning
    public void insertBeginning(int value) {
        DNode newNode = new DNode(value);
        if (head != null) 
        	head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertEnd(int value) {
        DNode newNode = new DNode(value);
        if (head == null) {
            head = newNode;
            return;
        }

        DNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        newNode.prev = temp;
    }

    // Insert at any position
    public void insertAt(int pos, int value) {
        if (pos == 0) {
            insertBeginning(value);
            return;
        }

        DNode newNode = new DNode(value);
        DNode temp = head;

        for (int i = 0; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null) temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Update
    public void update(int pos, int value) {
        DNode temp = head;
        for (int i = 0; i < pos && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        temp.data = value;
    }

    // Delete
    public void delete(int pos) {
        if (head == null) return;

        if (pos == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }

        DNode temp = head;
        for (int i = 0; i < pos && temp != null; i++)
            temp = temp.next;

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;
    }

    // Display forward
    public void displayForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();

        d.insertBeginning(10);
        d.insertEnd(20);
        d.insertAt(1, 99);
        d.update(1, 50);
        d.delete(2);

        d.displayForward();
    }
}