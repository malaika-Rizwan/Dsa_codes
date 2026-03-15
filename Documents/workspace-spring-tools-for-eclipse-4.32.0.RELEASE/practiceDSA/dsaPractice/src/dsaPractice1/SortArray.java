package dsaPractice1;
import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		  System.out.print("enter numbeer of index in array ");
		  int n=s.nextInt();
		  
		  int[] arr=new int[n];
		  System.out.print("enter numbers");
		  for (int i=0;i<n;i++) {
			 arr[i]=s.nextInt();
			  
		  }
		  Arrays.sort(arr);
		  
		  System.out.print("Sorted array :"+Arrays.toString(arr));
		  
	    
	}

}
