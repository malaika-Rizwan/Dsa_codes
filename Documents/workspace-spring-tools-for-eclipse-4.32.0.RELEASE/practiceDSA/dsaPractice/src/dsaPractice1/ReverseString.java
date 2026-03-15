package dsaPractice1;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "hello";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(reversed);
		
		/*
StringBuilder is a mutable (changeable) 
sequence of characters in Java.
Unlike String (which is immutable — 
once created, it cannot be changed), 
StringBuilder lets you modify the string contents 
(append, insert, delete, reverse, etc.) 
without creating a new object every time.
		 */
		
		String mk="malaika Rizwan";
		String rever=new StringBuilder(mk).reverse().toString();
		System.out.println(rever);
		
		String maths="!@#$$%^^&Malaika&**()(^#@!";
		String reverso=new StringBuilder(maths).reverse().toString();
		System.out.print(reverso);
		  
		
		StringBuilder sh=new StringBuilder("Maheen  ");
		for(int i=0;i<sh.length()/2;i++) {
			int front=i;
			int back=sh.length()-1-i;
			char frontchar=sh.charAt(front);
			char backchar=sh.charAt(back);
			sh.setCharAt(front, backchar);
			sh.setCharAt(back, frontchar);
			
			System.out.println(sh);
			  
		}
		


	}

}
