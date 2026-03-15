xdpackage information_security;

public class Substitution {

	public static void main(String[] args) {
		char[] StringA= {'A','B','C','D','E','F'};
		char[] StringB= {' ',' ',' ',' ',' ',' '};
		for(int i=0;i<3;i++) {
			StringB[i]=StringA[i+3];
			
		}for(int i=0;i<3;i++) {
			System.out.println(StringB[i]);
			
		}

	}

}
