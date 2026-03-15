package dsaPracticeLab;

public class BinarySearchMain {

	public static void main(String[] args) {
		
		BinarySearch bs=new BinarySearch();
	int[] arr= {5,20,30,40,50,60,70};
	int target=20;
	int result=bs.binarysearch(arr,target);
if(result==-1) {
	System.out.println("element not found");
	
}else {
	System.out.println("element  found at index :"+result );
}
	}

}
