package org.dev.dp;

public class LongestCommonSubsequence {
	
	public static void main (String[] args) {
		char[] a = new char[]{'a','b','r','g','h'};
		char[] b = new char[] {'b','c','d','e','t'};
		System.out.println("Longest common subsequence :: "+lcs(a,b,a.length,b.length));
	}
	
	public static int lcs(char[]a, char[]b, int length_a, int length_b ) {
		
		if (length_a == 0 || length_b == 0) {
			return 0;
		}
		if (a[length_a-1] == b[length_b-1]) {
			return 1 + lcs(a,b,length_a-1,length_b-1);
		}
		else {
			return Math.max(lcs(a,b,length_a,length_b-1), lcs(a,b,length_a-1,length_b));
		}
	}

}
