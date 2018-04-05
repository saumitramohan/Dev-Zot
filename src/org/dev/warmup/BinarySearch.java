package org.dev.warmup;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String args[]) {
		int[] array = { 2, 4, 5, 6, 7, 810, 13, 78 };
		Arrays.sort(array);
		
		System.out.println("Binary search value"+binarySearch (array, 0,array.length-1,0));

	}

	private static Boolean binarySearch(int[] array, int start, int end, int k) {
		if (start > end ) {
			return false;
		}
		int mid =  start +(end - start)/2;
		if (array[mid] == k) {
			return true;
		}
		else if (array[mid] > k) {
			return binarySearch( array,  start, mid-1, k);
		}
		else {
			return binarySearch( array,  mid+1, end, k);

		}
	}

}
