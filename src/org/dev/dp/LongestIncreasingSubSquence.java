package org.dev.dp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LongestIncreasingSubSquence {
	static HashMap<Integer, Integer> map = new HashMap<>();

	public static void main(String args[]) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60, 80 };
		for (int i = 0; i < arr.length; i++) {
			LIS(arr, i);

		}
		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
		int max = Integer.MIN_VALUE;
		while (it.hasNext()) {
			Integer value = it.next().getValue();
			if (max < value) {
				max = value;
			}
		}
		System.out.print("LIS :: " + max);

	}

	public static int LIS(int array[], int n) {
		int max = 0;
		if (map.containsKey(n)) {
			return map.get(n);
		}
		if (n == 0) {
			map.put(n, 1);
			return map.get(n);
		} else {
			for (int i = 0; i < n; i++) {
				if (array[n] > array[i]) {
					max = Math.max(LIS(array, n - 1) + 1, max);
				}
			}
			map.put(n, max);
			return max;
		}
	}

}
