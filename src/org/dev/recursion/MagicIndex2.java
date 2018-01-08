package org.dev.recursion;

public class MagicIndex2 {
	public static int magicIndexDuplicates(int[] arr) {
		return magicIndexDuplicates (arr,0,arr.length-1);

}

	private static int magicIndexDuplicates(int[] arr, int start, int end) {
		if(start > end) {
			return -1;
		}
		// arr[] = {-10(0),-5(1),2(2),2(3),2(4),3(5),4(6),7(7),9(8),12(9),13(10)};
		
		int mid = (start + end)/2;
		if(arr[mid] == mid) {
			return mid;
		}
		int leftIndex = Math.min(mid-1, arr[mid]);
		int left = magicIndexDuplicates(arr, start, leftIndex);
		if(left >=0) {
			return left;
		}
		int rightIndex = Math.max(mid+1,arr[mid]);
		int right = magicIndexDuplicates(arr, rightIndex, end);
	
		return right;
	}
	
	}
