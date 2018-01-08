package org.dev.warmup;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {
	// Whether string are of equal length
	// Check for whitespace and ask for ascii
	// Or my method of storing into a hashmap
	
	public static void main(String [] args) {
		
		boolean result;
		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		sc.close();
		result = stringCheckLength(firstString, secondString);
		if(!result) {
			System.out.println("Not Pnc");
		}
		else {
			System.out.println("First string after sort"+stringSort(firstString));
			System.out.println("Result is"+stringSort(firstString).
					compareToIgnoreCase(stringSort(secondString)));
		}
		
}
	public static boolean stringCheckLength(String str1, String str2) {
		// convert string to char array
		if(str1.length()!=str2.length()) {
			return false;
		}
		else
			return true;
	}
	
	public static String stringSort(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}

}