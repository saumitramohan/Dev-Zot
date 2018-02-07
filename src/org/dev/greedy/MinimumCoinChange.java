package org.dev.greedy;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumCoinChange {

	public static void main(String args[]) {
		HashMap <Integer,Integer> map  = new HashMap<>();
		int denomination[] = {500};
		Arrays.sort(denomination);
		int sum = 567;
		int index = denomination.length-1;
		while (index >= 0 && sum > 0) {
			while (denomination[index] <= sum ) {
				sum = sum - denomination[index];
				System.out.println("sum" + sum);

				if (map.containsKey(denomination[index])) {
					int val = map.get(denomination[index]);
					val ++;
					map.put(denomination[index], val);
				}
				else {
					map.put(denomination[index], 1);
				}
				if (sum == 0) {
					System.out.println("Sum achieved");
					break;
				}
				if (index == 0 && denomination[index] > sum) {
					System.out.println("Cannot break further");
					break;	
			}
			
			}
			index -- ;
		}
		for (int i =0; i< denomination.length; i++) {
			System.out.println("Key :: "+ denomination[i] +"Value ::"+map.get(denomination[i]) );
		}
	}
}
