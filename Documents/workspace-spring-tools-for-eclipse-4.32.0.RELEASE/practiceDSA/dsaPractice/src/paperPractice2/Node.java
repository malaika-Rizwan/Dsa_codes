package paperPractice2;

public class Node {
    int id;
    String title;
    String publisher;
    Double price;
    Node next;

    public Node(int id, String title, String publisher, Double price) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.next = null;
    }
}
