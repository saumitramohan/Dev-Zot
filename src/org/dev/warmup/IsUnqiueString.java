package org.dev.warmup;
import java.util.Scanner;

public class IsUnqiueString {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		sc.close();
		boolean result = isUniqueString(inputString);
		System.out.println("Result is +"+result); 
	}
	
	static boolean isUniqueString(String inputString) {
		boolean checkIfUniqueArray[] = new boolean[128];
		if(inputString.length() > 128) {
			return false;
		}
		else {
			for(int i = 0; i < inputString.length(); i++) {
				int asciiValue = inputString.charAt(i);
				if(checkIfUniqueArray[asciiValue]) {
					return false;
				}
				else {
					checkIfUniqueArray[asciiValue] = true;
				}
			}
		}
	
		return true;
	}

}

// Space complexity O(1)
// TimeComplexity O(n) - n is length of a string