package org.dev.recursion;

public class ReverseWords {
	//Given s = "the sky is blue",
	 //return "blue is sky the".
	public static void main(String args[]) {
		String s = "the sky is blue"; //
		char[] array = s.toCharArray();
		int fp = 0;
		int lp = array.length-1;
		while(fp < lp) {
			char c = array[fp];
			array[fp] = array[lp];
			array[lp] = c;
			lp --;
			fp++;
		}

	
	//eulb si yks eht
	int slowPointer = 0;
	int fastPointer = 0;
	int state;
	int length = array.length;
	boolean flag = false;
	while (slowPointer < length) {
		while (fastPointer < length) {
			fastPointer ++;
			if(array[fastPointer] == ' ' || fastPointer == length - 1 ) {
				break;
			}
		}
		state = fastPointer;
		state++;
		if(fastPointer != length - 1)
			fastPointer --;
		while(slowPointer < fastPointer) {
			char c = array[slowPointer];
			array[slowPointer] = array[fastPointer];
			array[fastPointer] = c;
			fastPointer--;
			slowPointer++;

		}
			slowPointer = state;
			fastPointer = slowPointer;
	}
	
	System.out.println(new String(array));
	}
}
