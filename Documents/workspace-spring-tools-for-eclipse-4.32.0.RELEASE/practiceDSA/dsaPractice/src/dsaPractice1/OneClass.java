package dsaPractice1;

import java.util.Scanner;

public class OneClass {
int arr[]=new int[5];
int index=0;

public void input() {
	Scanner s=new Scanner(System.in);
	System.out.print("enter value");
	arr[index]=s.nextInt();
	index++;
	
}
public void display() {
	for(int i=0;i<index;i++) {
		System.out.println(arr[i]);
		
	}
	
	
}
	public static void main(String[] args) {
		int choice=0;
		Scanner s=new Scanner(System.in);
		
		OneClass on=new OneClass();
		do {
			System.out.println("1 for input");
			System.out.println("2 for display");
			System.out.println("3 for exist");
			choice=s.nextInt();
			if(choice==1) {
				on.input();
			}
			if(choice==2) {
				on.display();
			}
			
			
		}while(choice!=3);
		
		
		
	}

}
