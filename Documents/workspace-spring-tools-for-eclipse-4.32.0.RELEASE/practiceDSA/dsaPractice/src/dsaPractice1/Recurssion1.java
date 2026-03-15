package dsaPractice1;

public class Recurssion1 {
	
	    public static int factorial(int n) {
	        if (n == 0) {   // base case
	            return 1;
	        } else {
	            return n * factorial(n - 1); // recursive call
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println(factorial(5)); // Output: 120
	    }
	}

