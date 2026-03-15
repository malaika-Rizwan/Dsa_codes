package dsaPractice1;

public class Recurssion2 {
	    public static int fib(int n) {
	        if (n == 0) {
	            return 0;  // base case 1
	        } else if (n == 1) {
	            return 1;  // base case 2
	        } else {
	            return fib(n - 1) + fib(n - 2); // recursive case
	        }
	    }

	    public static void main(String[] args) {
	        int terms = 10; // how many numbers to print
	        System.out.print("Fibonacci Series: ");
	        for (int i = 0; i < terms; i++) {
	            System.out.print(fib(i) + " ");
	        }
	    }
	}

