package sirjunaidclass;

import java.util.Scanner;

public class insertionInstart {
		Node head;

		
		 
	
	public void insertat_start(int value) {
		Node newnode=new Node(value);
		newnode.next=head;
		head=newnode;
		
	}
public void display() {
	if(head==null) {
		 System.out.println("linked list is empty");
		 return;
	}
	Node curr=head;
	while (curr!=null) {
		 System.out.print(curr.data+"-->");
		 curr=curr.next;
		
	}
	 System.out.print("null");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		insertionInstart in=new insertionInstart();
	
        in.insertat_start(10);
        in.insertat_start(20);
        in.insertat_start(30);
        in.insertat_start(00);
        in.insertat_start(-10);
       
       in.display();

	}

}
