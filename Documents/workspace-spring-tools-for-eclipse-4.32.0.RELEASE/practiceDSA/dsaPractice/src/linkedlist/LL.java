package linkedlist;

import java.util.LinkedList;

public class LL {

	public static void main(String[] args) {
	LinkedList<String> li=new LinkedList<String>();
	
	li.addFirst("my");
	li.addFirst("name");
	li.addFirst("is");
	li.addFirst("malaika");
	li.addLast("age");
	li.addLast("is");
	li.addLast("21");
	System.out.println(li);
	System.out.println(li.size());
	
	for(int i=0;i<li.size();i++) {
		System.out.print(li.get(i)+"-->");
		
		
	}System.out.println("null");

	}

}
