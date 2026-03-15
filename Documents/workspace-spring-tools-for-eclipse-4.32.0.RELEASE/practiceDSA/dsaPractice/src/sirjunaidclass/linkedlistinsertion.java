package sirjunaidclass;

public class linkedlistinsertion {
	Node head;
	public void insert_sepecific_position(int data,int position) {
		Node nw=new Node(data);
		if(position==1) {
			nw.next=head;
			head=nw;
			return;
		}
		Node temp=head;
		for(int i=1;i<position-1 && temp!=null;i++) {
			temp=temp.next;
		}
		if(temp==null) {
			System.out.println("position out of range");
			return;
			
		}
		nw.next=temp.next;
		temp.next=nw;
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		
		}System.out.println("Null");
	}

	public static void main(String[] args) {
		linkedlistinsertion li=new linkedlistinsertion();
		li.insert_sepecific_position(22, 1);
		li.insert_sepecific_position(33, 2);
		li.insert_sepecific_position(44, 3);
		li.insert_sepecific_position(55, 4);
		li.display();
		
	}

}
