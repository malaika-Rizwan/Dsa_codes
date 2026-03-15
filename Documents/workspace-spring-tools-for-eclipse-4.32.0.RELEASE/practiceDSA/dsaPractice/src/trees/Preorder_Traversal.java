package trees;

public class Preorder_Traversal {
//Root → Left → Right
    void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Preorder_Traversal obj = new Preorder_Traversal();
        obj.preorder(root);
    }
}
