package abdullahcodes;

class Node {
 int data;
 Node next;

 public Node(int data) {
     this.data = data;
     this.next = null;
 }
}

public class StackLinkedList {
 Node top = null;

 // push
 public void push(int value) {
     Node newNode = new Node(value);

     newNode.next = top;  // link new node to previous top
     top = newNode;       // update top
 }

 // pop
 public int pop() {
     if (top == null) {
         System.out.println("Stack Underflow");
         return -1;
     }

     int value = top.data;
     top = top.next;  // move top down
     return value;
 }

 // peek
 public int peek() {
     if (top == null) {
         System.out.println("Stack Empty");
         return -1;
     }
     return top.data;
 }

 // display
 public void display() {
     if (top == null) {
         System.out.println("Stack is empty");
         return;
     }

     System.out.print("Stack: ");
     Node temp = top;
     while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
     }

     System.out.println();
 }

 // main function
 public static void main(String[] args) {
     StackLinkedList s = new StackLinkedList();

     s.push(5);
     s.push(10);
     s.push(15);
     s.pop();
     s.push(20);

     s.display();  // Output: Stack: 20 10 5
 }
}
