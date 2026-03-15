package lab1paperprac;

import java.util.Scanner;

public class Productmanager {
	Scanner s=new Scanner(System.in);
String id;
String name;
Double price;
Productmanager parr[]=new Productmanager[5];
int index=0;

public void addProduct() {
	
	if(index>=parr.length) {
		System.out.print("No space left to save product ");
		return;
	}parr[index] =new Productmanager();
	System.out.println("enter product id");parr[index].id=s.nextLine();
	System.out.println("enter product name");parr[index].name=s.nextLine();
	System.out.println("enter product price");parr[index].price=s.nextDouble();
	
	index++;
	
	System.out.println("product addedd successfully");
}
public void deleteProduct() {
	if(index==0) {
		System.out.print("No products to delete ");
		return;
	}   
	 System.out.println("enter product id to delete product");String deleteid=s.nextLine();
	 boolean found=false;
	     
	     for(int i=0;i<index;i++) {
	    	 if(deleteid==parr[i].id) {
		 System.out.println("product id :"+parr[i].id);
		 System.out.println("product name"+parr[i].name);
		 System.out.println("product price"+parr[i].price);
		
		 
		 for(int j=i;j<index-1;j++) {
			 parr[j]=parr[j+1];
			 
		 }
		 parr[index-1]=null;
		 index--;
		 found=true;
		 break;
		
	    	 }if(!found) {
	    		 System.out.print("products not found ");
	    			
	    	 }
	    	 }
	
	
}
public void displayProduct() {
	if(index==0) {
		System.out.print("No products save ");
		return;
	}
	
	      System.out.println("products are:");
	     for(int i=index;i<parr.length;i++) {
		 System.out.println("product id :"+parr[i].id);
		 System.out.println("product name"+parr[i].name);
		 System.out.println("product price"+parr[i].price);
		
	}
	
	
}
public void seacrhProduct() {
	if(index==0) {
		System.out.print("No products to search ");
		return;
	}   
	 System.out.println("enter product id to search product");String Searchid=s.nextLine();
	 boolean found=false;
	     
	     for(int i=0;i<index;i++) {
	    	 if(Searchid==parr[i].id) {
		 System.out.println("product id :"+parr[i].id);
		 System.out.println("product name"+parr[i].name);
		 System.out.println("product price"+parr[i].price);
		 found=true;
		 break;
		
	    	 }if(!found) {
	    		 System.out.print("products not found ");
	    			
	    	 }
	    	 }
	
	
}
public void updateProduct() {
	if(index==0) {
		System.out.print("No products to update ");
		return;
	}   
	 System.out.println("enter product id to update product");String updateid=s.nextLine();
	 boolean found=false;
	     
	     for(int i=0;i<index;i++) {
	    	 if(updateid==parr[i].id) {
	    		 System.out.println("enter new product id");parr[index].id=s.nextLine();
	    			System.out.println("enter new  product name");parr[index].name=s.nextLine();
	    			System.out.println("enter new product price");parr[index].price=s.nextDouble();
		 found=true;
		 break;
		
	    	 }if(!found) {
	    		 System.out.print("products not found to update ");
	    			
	    	 }
	    	 }
}

}
