package org.dev.warmup;

import java.util.Scanner;

public class Urlify {
	// Input : "Mr John Smith " //13
	// Ouput : "Mr%20John%20Smith"

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < inputString.length(); i++) {
			if(inputString.charAt(i) == ' ') {
				sb.append("%20");
			}
			else {
				sb.append(inputString.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}
}
