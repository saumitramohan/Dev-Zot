package org.dev.Math;

public class RecursiveMax {
	
	public static void main (String args[]) {
		int array[] = {1,25,34,42,10,16,7,8};
		System.out.println(getMax(array,array.length-1));
	}

	private static int getMax(int[] arr, int i) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return arr[0];
		}
		return Math.max(getMax(arr,i-1),arr[i]);
	}

}
