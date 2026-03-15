package information_security;

import java.util.Scanner;

public class FindPercentage {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total, obtain;

       while(true) {
    	   System.out.println("Enter number(0-50) or -1 for exict");
    	   total=s.nextInt();
    	   if(total==-1) {
    		   System.out.println("Program exited.");
               break;
    	   }
    	   if(total<=0 || total>=50) {
    		   System.out.println("Enter a valid number between 1 and 50.");
    		   continue;
    	   }
    	   
    	   
      
 while(true) {
	 System.out.println("Enter obtained marks:");
     obtain = s.nextInt();
    if(obtain>=0 && obtain<=total) {
    	float percentage=(obtain*100.0f)/total;
    	 System.out.println("Percentage ="+percentage+"%");
    	 break;
    }else {
    	 System.out.println("input a valid number");
    }
    	   
    	   
       }
       }
        
        s.close();
    }
}
