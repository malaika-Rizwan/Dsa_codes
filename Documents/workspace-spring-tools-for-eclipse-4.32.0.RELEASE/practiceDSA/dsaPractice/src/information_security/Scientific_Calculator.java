package information_security;
import java.util.*;

public class Scientific_Calculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
        double n1, n2 = 0;   // use double to handle more cases
        String opt;

        System.out.println("Enter first number:");
        n1 = s.nextDouble();

        System.out.println("Choose operator:");
        System.out.println("+  \t-  \t*  \t/  \t%  \t** (power) \tmod  \texp  \tlog");

        opt = s.next();  // operator input

        // For some operations (like log, exp), we don’t need second number
      if(!(opt.equals("exp") || opt.equals("log"))) {
    	  System.out.println("Enter second number:");
          n2 = s.nextDouble();
      }
      double result=0;
      switch(opt) {
      case"+":
    	  result=n1+n2;
    	  break;
      case"-":
    	  result=n1-n2;
    	  break;
      case"/":
    	  if(n2!=0) {
    		  result=n1/n2;  
    	  }else {
    		  System.out.print("Division by zero is not allowed");
    	  }
    	
    	  break;
      case"*":
    	  result=n1*n2;
    	  break;
      case"**":
    	  result=Math.pow(n1,n2);
    	  break;
      case "%":
      case "mod":
          result = n1 % n2;
          break;
      case"exp":
    	  result=Math.exp(n1);
    	  break;
      case"log":
    	 if(n1>0) {
    		 result=Math.log(n1);
    	 }else {
             System.out.println("Logarithm only defined for positive numbers");

    	 }
    	  break;
    	  default:
    		  System.out.println("Invalid operator entered");
    	  
      }  System.out.println(" Result = " + result);
      
      System.out.println("Do you want to calculate again? (y/n)");
      char choice = s.next().toLowerCase().charAt(0);

      if (choice == 'n') {
          System.out.println("Program exited.");
          break;
      }
  }
       
    }
}
