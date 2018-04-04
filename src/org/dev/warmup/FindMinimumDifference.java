package org.dev.warmup;

import java.util.Arrays;

public class FindMinimumDifference {
	
	public static void main (String args[]) {
		int [] array1 = {1,2,11,15};
		int [] array2 = {4,12,19,23,127,235};
		System.out.println("Minimum difference"+findMinimumDifference(array1,array2));
	}
	
	public static int findMinimumDifference (int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		int runnerOne = 0;
		int runnerTwo = 0;
		int min = Integer.MAX_VALUE;
		while (runnerOne < array1.length && runnerTwo < array2.length) {
			int difference = array1[runnerOne] - array2[runnerTwo];
			if (min > Math.abs(difference)) {
				min = Math.abs(difference);
			}
			if (difference > 0) {
				runnerTwo++;
			}
			else {
				runnerOne++;
			}
			
		}
		return min;
	}

}
