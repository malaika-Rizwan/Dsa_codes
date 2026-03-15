package treePrac;

public class BinaryTree {
Node root;
	public static void main(String[] args) {
		BinaryTree bt=new BinaryTree();
		
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(5);
		bt.root.left.right=new Node(6);

	}

}
