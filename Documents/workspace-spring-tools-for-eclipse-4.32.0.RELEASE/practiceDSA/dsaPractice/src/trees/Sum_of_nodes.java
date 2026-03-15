package trees;

public class Sum_of_nodes {

    public static int SumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {

        // Create tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(SumOfNodes(root));
    }
}
