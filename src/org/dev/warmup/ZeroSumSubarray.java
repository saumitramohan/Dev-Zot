package org.dev.warmup;

import java.util.HashMap;

public class ZeroSumSubarray {
	
	public static void main (String args[]) {
		int array[] = {4,2,-3,1,6};
		System.out.println ("Find if the subarray array has zero sum"+ findSubarrayWithZeroSum(array));
	}

	private static boolean findSubarrayWithZeroSum(int[] array) {
		// TODO Auto-generated method stub
		HashMap <Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		for (int i =0;i<array.length; i++) {
			sum += array[i];
			if (map.containsKey(sum)) {
				int value = map.get(sum) + 1;
				System.out.println("Subarray exists from : "+value+" to "+i);
				return true;
			}
			else {
				map.put(sum, i);
			}
		}
		return false;
	}
	
	
}
