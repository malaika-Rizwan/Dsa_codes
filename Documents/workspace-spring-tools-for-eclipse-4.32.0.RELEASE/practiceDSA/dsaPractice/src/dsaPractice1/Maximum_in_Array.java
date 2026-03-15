package dsaPractice1;
import java.util.*;

public class Maximum_in_Array {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
       System.out.print("enter n");
       int n=sc.nextInt();
       
       int[] arr=new int[n];
       System.out.print("enter numbers");
       for (int i=0;i<n;i++) {
    	   arr[i]=sc.nextInt();
    	   
       }
      int Max=arr[0];
      for(int i=0;i<arr.length;i++) {
    	  if(arr[i]>Max) {
    		  Max=arr[i];
    	  }
    	  
      }
      System.out.print("maximum number in array is :"+Max);
        sc.close();
    }
}
