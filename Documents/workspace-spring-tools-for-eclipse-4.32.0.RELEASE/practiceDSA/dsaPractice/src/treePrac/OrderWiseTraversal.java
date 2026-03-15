package treePrac;

public class OrderWiseTraversal {
	private static Node root;


	public void inorder(Node root) {
		//Left → Root → Right
		if(root==null) {
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public void postorder(Node root) {
		//Left → Right → Root
		if(root==null) {
			return ;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	public void preorder(Node root) {
		//Root → Left → Right
		if(root==null) {
			return ;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
		
	}
	

	public static void main(String[] args) {
		OrderWiseTraversal ot=new OrderWiseTraversal();
		ot.root=new Node(1);
		ot.root.left=new Node(2);
		ot.root.right=new Node(3);
		ot.root.left.left=new Node(5);
		ot.root.left.right=new Node(6);
		
		 System.out.print("Inorder: ");
	        ot.inorder(root);

	        System.out.print("\nPostorder: ");
	        ot.postorder(root);

	        System.out.print("\nPreorder: ");
	        ot.preorder(root);
		
	}

}
