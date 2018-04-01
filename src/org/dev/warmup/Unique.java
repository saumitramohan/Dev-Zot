package org.dev.warmup;

import java.util.HashSet;

public class Unique {
	public static void main(String [] args) {
		String inputString = "abcdef";
		System.out.println("Is string unique :: "+isUnique(inputString));
	}
	public static boolean isUnique(String inputString) {
		HashSet<Character> set = new HashSet<Character>();
		for (int i =0; i<inputString.length(); i++) {
			if (!set.contains(inputString.charAt(i))) {
				set.add(inputString.charAt(i));
			}
			else {
				return false;
			}
		}
		return true;
	}

}
