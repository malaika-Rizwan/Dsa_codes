package dsaPractice1;

public class Bits {

	public static void main(String[] args) {
		int n=5;
		int pos=2;
		int bittmask=1<<pos;
		if((bittmask & n)==0) {
			System.out.println("bit was zero");
		}else {
			System.out.println("bit was one");
		}
		
		
		int n2=5;
		int pos2=1;
		int bittmask2=1<<pos2;
		int newNumber=bittmask2 | n2;
		System.out.println(newNumber);

	}

}
