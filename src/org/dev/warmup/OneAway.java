package org.dev.warmup;
import java.util.Scanner;

public class OneAway {
	public static void main(String args[]) {
		boolean result;
		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();
		sc.close();
		// Check whether one character can replace it
		if(firstString.length() == secondString.length()) {
			result = oneEditReplace(firstString, secondString);
			System.out.println("Result :: One way replace "+ result);

		}
		else if(firstString.length() +1 == secondString.length()) {
			result = oneEditInsertOrSub(firstString, secondString);
			System.out.println("Result :: Edit way replace "+ result);
		}
		else if(firstString.length() == secondString.length() +1) {
			result = oneEditInsertOrSub(secondString, firstString);
			System.out.println("Result :: Edit way replace 2"+ result);
		}
		else {
			System.out.println("Not possible");
		}
			
			
}
	public static boolean oneEditReplace(String firstString, String secondString) {
		boolean oneDiffernceFlag = false;
		for (int i = 0; i < firstString.length(); i++) {
			if(firstString.charAt(i)!=secondString.charAt(i)) {
				if(oneDiffernceFlag) {
					return false;
				}
				oneDiffernceFlag = true;
			}
		}
		return true;
	}
	
	public static boolean oneEditInsertOrSub(String shorterString, String longerString) {
		int index1 = 0;
		int index2 = 0;
		while(index2 < longerString.length() && index1 < shorterString.length()) {
			if(shorterString.charAt(index1) != longerString.charAt(index2)) {
				if(index1!=index2) {
					return false;
				}
				index2++;
			}
			index1++;
			index2++;
		}
		return true;
	
}
}
