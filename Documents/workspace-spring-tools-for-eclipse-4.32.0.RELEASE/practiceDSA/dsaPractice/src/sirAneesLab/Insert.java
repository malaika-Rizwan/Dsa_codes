package sirAneesLab;

import java.util.Scanner;

public class Insert {
		Node head;

	public void insertat_end(int value) {
		Node newnode=new Node(value);
		if(head==null) {
			head=newnode;
			
		}else {
			Node curr=head;
			while(curr.next!=null) {
				curr=curr.next;
				
			}
			curr.next=newnode;
			
			
		}
		 
	}
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

		Insert in=new Insert();
	
        in.insertat_end(10);
        in.insertat_end(20);
        in.insertat_end(30);
        in.insertat_start(00);
        in.insertat_start(-10);
       
       in.display();

	}

}
