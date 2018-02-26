package org.dev.warmup;

public class SolutionSubStringLongest {

	// int startIndex = 0;
	// int longestStartIndex = 0;
	// int endIndex = 0;
	// int index = 0;
	// int longestLength = Integer.MIN_VALUE;
	// boolean foundUpperCase = false;
	//
	// while(index <= testString.length()) {
	// if (index == testString.length() ||
	// Character.isDigit(testString.charAt(index))) {
	// if (foundUpperCase && index > startIndex && index - startIndex >
	// longestLength) {
	// longestLength = index - startIndex;
	// endIndex = index;
	// longestStartIndex = startIndex;
	// }
	// startIndex = index + 1;
	// foundUpperCase = false;
	// } else if (Character.isUpperCase(testString.charAt(index))) {
	// foundUpperCase = true;
	// }
	// index++;
	// }

	public static int test(String test) {
		int index = 0;
		boolean isUpperCharFound = false;
		int newIndex = 0;
		int maxLength = 0;
		while (index < test.length()) {
			 if (index == test.length()-1 || isDigitTest(index,test.length(),test)) {
				if (isUpperCharFound && index > newIndex && index - newIndex > maxLength) {
					System.out.println("index"+index);
					System.out.println("New index"+newIndex);

					maxLength = index - newIndex ;
				}
				newIndex = index ;
				isUpperCharFound = false;
			}
			 
			else if  (isUpperCaseChar(test.charAt(index)))
				isUpperCharFound = true;
			index++;
		}
		
		if (maxLength == 0) {
			return -1;
		}
		
		return maxLength;

	}

	public static boolean isUpperCaseChar(char c) {
		
		if (Character.isUpperCase(c)) {
			return true;
		}
		return false;
	}
	public static boolean isDigitTest(int index, int length, String test) {
		if (index < length) {
			if (Character.isDigit(test.charAt(index)))
					return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		String string = "a0B0";
		System.out.println(test(string));
	}
}

// String testString =
// "skjssldfkjsakdfjlskdssfkjslakdfiop7adfaijsldifjasdjfil8klsasdfŞdijpfjapodifjpoaidjfpoaidjpfi9a";

// int startIndex = 0;
// int longestStartIndex = 0;
// int endIndex = 0;
// int index = 0;
// int longestLength = Integer.MIN_VALUE;
// boolean foundUpperCase = false;
//
// while(index <= testString.length()) {
// if (index == testString.length() ||
// Character.isDigit(testString.charAt(index))) {
// if (foundUpperCase && index > startIndex && index - startIndex >
// longestLength) {
// longestLength = index - startIndex;
// endIndex = index;
// longestStartIndex = startIndex;
// }
// startIndex = index + 1;
// foundUpperCase = false;
// } else if (Character.isUpperCase(testString.charAt(index))) {
// foundUpperCase = true;
// }
// index++;
// }
