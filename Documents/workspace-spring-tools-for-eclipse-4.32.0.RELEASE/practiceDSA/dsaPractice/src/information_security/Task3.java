package information_security;

public class Task3 {

	public static void main(String[] args) {
		
		char[] StringA= {'j','k','L','M','N'};
		
		char[] StringB= {' ',' ',' ',' ',' ',' '};
		
		for(int i=0;i<StringA.length;i++) {
			StringB[i]=(char)(StringA[i]-3);
			
		}for(int i=0;i<5;i++) {
			System.out.print(StringB[i]);
			
		}

	}

}
