package dsaPracticeLab;

public class BinarySearch {
	
	
public int binarysearch(int[] arr,int target) {
	
	int l=0;
	int h=arr.length-1;
	while(l<=h) {
		{
			int mid=(l+h)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]>target) {
				h= mid-1;
			}else {
				l=mid+1;
			}}}return -1;
	}}

