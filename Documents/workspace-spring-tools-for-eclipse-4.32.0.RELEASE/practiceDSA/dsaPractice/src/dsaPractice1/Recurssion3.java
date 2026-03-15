package dsaPractice1;

public class Recurssion3 {
	    // Wrapper so user can call fib(n) without passing depth
	    public static int fib(int n) {
	        return fib(n, 1); // start depth/stack-height at 1
	    }

	    // Recursive fibonacci that prints "X^depth" on each call
	    public static int fib(int n, int depth) {
	        // Print the current stack height representation
	        System.out.println("Enter call: X^" + depth + " (n = " + n + ")");

	        // Base cases
	        if (n == 0) {
	            System.out.println("Return from: X^" + depth + " => 0");
	            return 0;
	        } else if (n == 1) {
	            System.out.println("Return from: X^" + depth + " => 1");
	            return 1;
	        }

	        // Recursive calls (depth increases by 1)
	        int a = fib(n - 1, depth + 1);
	        int b = fib(n - 2, depth + 1);

	        int result = a + b;
	        System.out.println("Return from: X^" + depth + " => " + result);
	        return result;
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        System.out.println("Fibonacci(" + n + ") = " + fib(n));
	    }
	}

