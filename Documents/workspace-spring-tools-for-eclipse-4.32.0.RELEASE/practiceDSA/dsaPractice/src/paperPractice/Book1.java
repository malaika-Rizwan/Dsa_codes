package paperPractice;
import java .util.Scanner;
public class Book1 {
	 int id;
	String title;
	String publisher;
	Double price;
	Book1[] bkarr=new Book1[5];
	int index=0;
	
	Scanner s =new Scanner(System.in);
	public void addBook() {
		if(index>=bkarr.length) {
			System.out.println("you are array is full");
			return;
			
		}
		bkarr[index] =new Book1();
		System.out.println("enter id");
		bkarr[index].id=s.nextInt();
		System.out.println("enter title");
		bkarr[index].title=s.nextLine();
		System.out.println("enter publisher");
		bkarr[index].publisher=s.nextLine();
		System.out.println("enter price");
		bkarr[index].price=s.nextDouble();
		index++;
	}
	public void display() {
		if(index==0) {
			System.out.println("no books data stored");
			return;
		}
		for (int i=0;i<index;i++) {
		System.out.println("id  = "+bkarr[index].id);
		System.out.println("title  ="+bkarr[index].title);
		System.out.println("publisher  ="+bkarr[index].publisher);
		System.out.println("price  ="+bkarr[index].price);
		}
		
	}
	public void searchBook() {
		if(index==0) {
			System.out.println("no books data stored to search");
			return;
		}
		
		System.out.println("enter book id to search");
		int Serachid=s.nextInt();
		boolean found=false;
		
		for (int i=0;i<index;i++) {
			if(Serachid==bkarr[i].id) {
		System.out.println("id  = "+bkarr[index].id);
		System.out.println("title  ="+bkarr[index].title);
		System.out.println("publisher  ="+bkarr[index].publisher);
		System.out.println("price  ="+bkarr[index].price);
		found=true;break;
		}}
		if(!found) {
			System.out.println("book not found");
		}
		
	}public void deleteBook(int deleteid) {
		if(index==0) {
			System.out.println("no books data stored to delte");
			return;
		}
		
	
		boolean found=false;
		
		for (int i=0;i<index;i++) {
			if(deleteid==bkarr[i].id) {
		
		System.out.println("title  ="+bkarr[index].title+"book delete successfully");
		for (int j=i;j<index-1;i--) {
			bkarr[j]=bkarr[j+1];
			bkarr[index-1]=null;
			index--;
			
		}
		found=true;break;
		}}
		if(!found) {
			System.out.println("book not found");
		}
		
	}
	
	

}
