package org.dev.recursion;

public class MagicIndex1 {
	
	public static int findMagicIndex(int []arr, int start, int end) {
		if( end < start) {
			return -1;
		}
		int mid =  (start + end)/2;
		if(arr[mid] == mid) {
			return mid;
		}
		else if (arr[mid] > mid) {
			return findMagicIndex(arr,start, mid-1);
		}
		else	
			return findMagicIndex(arr,mid+1, start);
	}
		
}
