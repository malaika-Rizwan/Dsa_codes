package trees;



public class SubTree_of_Another_Tree {

    // Check if two trees are identical
    public static boolean isSameTree(Node t, Node s) {
        if (t == null && s == null)
            return true;

        if (t == null || s == null)
            return false;

        if (t.data != s.data)
            return false;

        return isSameTree(t.left, s.left) &&
               isSameTree(t.right, s.right);
    }

    // Check if S is subtree of T
    public static boolean isSubtree(Node T, Node S) {
        if (S == null)
            return true;

        if (T == null)
            return false;

        if (isSameTree(T, S))
            return true;

        return isSubtree(T.left, S) ||
               isSubtree(T.right, S);
    }

    public static void main(String[] args) {

        // Main Tree
        Node T = new Node(1);
        T.left = new Node(2);
        T.right = new Node(3);
        T.left.left = new Node(4);
        T.left.right = new Node(5);

        // Sub Tree
        Node S = new Node(2);
        S.left = new Node(4);
        S.right = new Node(5);

        if (isSubtree(T, S))
            System.out.println("S is a subtree of T");
        else
            System.out.println("S is NOT a subtree of T");
    }
}
