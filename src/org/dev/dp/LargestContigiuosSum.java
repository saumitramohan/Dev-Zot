package org.dev.dp;

import java.util.HashMap;
import java.util.Map;

public class LargestContigiuosSum {
	static HashMap <Integer, Integer> map = new HashMap();
	public static void main(String[] args) {
		int array[] =  {-2, -3, 4, -1, -2, 1, 5, -3};
		int index = array.length;
		int maxSofar = 0;
		for (int i =0; i< index ; i++)
			maximumContigiousSum(array,i);
		for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
			System.out.println(entry.getValue());
		}
		
	}

	private static int maximumContigiousSum(int[] array, int index) {
		// TODO Auto-generated method stub
		if (map.containsKey(index)) {
			return map.get(index);
		}
		
		if (index == 0) {
			if (array[index] > 0) {
				map.put(index, array[index]);
				return array[index];
			}
			else {
				map.put(index,0);
				return 0;
			}
				
		}
		int max = Math.max(maximumContigiousSum(array, index-1) + array[index], array[index]);
		if (max < 0) {
			map.put(index, 0);
			return 0;
		}
		map.put(index, max);
		return max;
		
	}

}
