package org.dev.warmup;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram_HR {
	public static void main(String[] args) {
		int answer = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		Scanner sc = new Scanner(System.in);
		String anagramArray[] = new String[2];
		anagramArray[0] = sc.nextLine();
		anagramArray[1] = sc.nextLine();
		sc.close();

		for (int k = 0; k < anagramArray[0].length(); k++) {
			char c = anagramArray[0].charAt(k);
			if (map.containsKey(c)) {
				int value = map.get(c);
				value++;
				map.put(c, value);
			} else {
				map.put(c, 1);
			}
		}
		for (int l = 0; l < anagramArray[1].length(); l++) {
			char c = anagramArray[1].charAt(l);
			if (map.containsKey(c)) {
				int value1 = map.get(c);
				value1--;
				map.put(c, value1);
			}
			else {
				if(map2.containsKey(c)) {
					int value2 = map2.get(c);
					value2++;
					map2.put(c, value2);
				}
				else {
					map2.put(c, 1);
				}
			}

		}

		for (int val : map.values()) {

			answer = answer + val;
		}
		for(int val : map2.values()) {
			answer = answer + val;
		}
		System.out.println("Final answer is :: " + answer);
	}
	// remove the common first
	// longer string remaining aplhabets
}
