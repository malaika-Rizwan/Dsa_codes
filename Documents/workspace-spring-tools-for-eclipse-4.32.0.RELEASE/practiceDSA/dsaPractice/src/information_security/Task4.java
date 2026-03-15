package information_security;

public class Task4 {

	public static void main(String[] args) {
		String dat="zoom";
		String newdat;
		
		for(int i=0;i<dat.length();i++) {
			
			newdat+=(char)(dat[i]-3);
			
		}
		System.out.print(newdat);

	}

}
