package trees;

import java.util.*;

public class Print_Level_Order_Traversal {

    // Level Order Traversal Method
    public void levelOrder(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null)
                q.add(temp.left);

            if (temp.right != null)
                q.add(temp.right);
        }
    }

    public static void main(String[] args) {

        // Creating tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        Print_Level_Order_Traversal obj = new Print_Level_Order_Traversal();
        obj.levelOrder(root);
    }
}
