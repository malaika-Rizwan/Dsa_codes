package ArrayPractice;

import java.util.Scanner;



public class Bank {
	int id;
    String name;
    String accountType;
    double balance;
    Bank[] bk;
    int index;
    Scanner s=new Scanner(System.in);
    public Bank() {
    	bk=new Bank[5];
    	index=0;
    }
public void input() {
	  if (index >= bk.length) {
          System.out.println(" Array is full! Cannot add more accounts.");
          return;
      }
	bk[index]=new Bank();
	System.out.println("enter account id");bk[index].id=s.nextInt();
	System.out.println("enter account name");bk[index].name=s.nextLine();s.nextLine();
	System.out.println("enter account type");bk[index].accountType=s.nextLine();
	System.out.println("enter account balance");bk[index].balance=s.nextInt();
	index++;
	
}
public void display() {
	if (index == 0) {
        System.out.println("❌ No account data found!");
        return;
    }else {
    	for(int i=0;i<index;i++) {
    		System.out.println("id of account is :"+bk[i].id);
    		System.out.println("Name of account is :"+bk[i].name);
    		System.out.println("accountType of account is :"+bk[i].accountType);
    		System.out.println("balance present account is :"+bk[i].balance);
    		
    	}
    	
    	
    }
	
}
	public static void main(String[] args) {
		
		Bank B=new Bank();
		 Scanner s=new Scanner(System.in);
		 int choice;
		
		do {
			System.out.println("select your choice");
			System.out.println("1 for input data");
			System.out.println("2 for display data");
			System.out.println("3 for exist");
			 choice=s.nextInt();
			switch(choice) {
			case 1:
				B.input();
				break;
			case 2:
				B.display();
				break;
			}
			
		}while(choice!=3);

	}

}
