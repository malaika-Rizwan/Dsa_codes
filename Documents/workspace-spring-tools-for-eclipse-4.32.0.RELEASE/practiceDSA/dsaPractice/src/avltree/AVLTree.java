package avltree;

public class AVLTree {
	class Node {
	    int key, height;
	    Node left, right;

	    Node(int d) {
	        key = d;
	        height = 1;
	    }}

    private Node root;

    // Get height of node
    int height(Node n) {
        if (n == null)
            return 0;
        return n.height;
    }

    // Get Balance Factor
    int getBalance(Node n) {
        if (n == null)
            return 0;
        return height(n.left) - height(n.right);
    }

    // Right Rotation (LL Case)
    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // new root
    }   
    // Left Rotation (RR Case)
    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // new root
    }

    // Insert node
    Node insert(Node node, int key) {

        // Normal BST Insert
        if (node == null)
            return new Node(key);

        if (key < node.key)
            node.left = insert(node.left, key);
        else if (key > node.key)
            node.right = insert(node.right, key);
        else
            return node; // duplicate keys not allowed

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get Balance Factor
        int balance = getBalance(node);

        // Case 1: LL
        if (balance > 1 && key < node.left.key)
            return rightRotate(node);

        // Case 2: RR
        if (balance < -1 && key > node.right.key)
            return leftRotate(node);

        // Case 3: LR
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Case 4: RL
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Wrapper Insert
    public void insert(int key) {
        root = insert(root, key);
    }

    // Inorder Traversal (Sorted Order)
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public void inorder() {
        inorder(root);
        System.out.println();
    }

    // Preorder (to show structure)
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.print("Inorder Traversal: ");
        tree.inorder();

        System.out.print("Preorder Traversal: ");
        tree.preorder();
    }
}
