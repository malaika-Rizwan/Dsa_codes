package linkedlist;

import java.util.Scanner;

// Node class to represent each element in the linked list
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Main LinkedList class
class IntegerLinkedList {
    private Node head;

    
    public void insert_at_begining(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println(value + " inserted successfully!");
    }

    
    public void display() {
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
}

// Driver class with menu
public class IntegerLinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntegerLinkedList list = new IntegerLinkedList();
list.insert_at_begining(10);
list.insert_at_begining(20);
list.insert_at_begining(30);
list.insert_at_begining(40);
list.display();
      
            }
        
    }

