package doublylinkedlist;




public class Node {
    int id;
    String title;
    String publisher;
    double price;

    Node next;
    Node prev;

    public Node(int id, String title, String publisher, double price) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.next = null;
        this.prev = null;
    }
}
