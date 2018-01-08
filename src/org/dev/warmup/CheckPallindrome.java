package org.dev.warmup;

import java.util.HashMap;
import java.util.Scanner;

public class CheckPallindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		int oddCount = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < inputString.length(); i++) {
			int ascii = Character.getNumericValue(inputString.charAt(i));
			int a = Character.getNumericValue('a');
			int z = Character.getNumericValue('z');
			if (ascii >= a && ascii <= z) {
				if (map.containsKey(ascii)) {
					int value = map.get(ascii);
					value++;
					map.put(ascii, value);
				} else {
					map.put(ascii, 1);
				}
			}
		}
		// Count the values - if all are even or one is odd then we are good
		for (int k : map.values()) {

			if (k % 2 != 0) {
				oddCount++;
			}

		}
		if (oddCount > 1) {
			System.out.println("Not a pallindrome");
		}
		else {
			System.out.println("Its is a Pallindrome");

		}
	}

}
