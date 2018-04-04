package org.dev.string;

public class PrintPermutations {
	public static void main(String args[]) {
		String str = "ABC";
		Permute(str, 0, str.length() - 1);

	}

	public  static void Permute(String str, int start, int end) {
		if (start == end) {
			System.out.println(str);
		} else {
			for (int i = start; i <= end; i++) {
				str = swap(str, start, i);
				Permute(str, start + 1, end);
				str = swap(str, start, i);
			}
		}
	}

	public static String swap(String str, int start, int end) {
		char[] c = str.toCharArray();
		char temp = c[start];
		c[start] = c[end];
		c[end] = temp;
		return new String(c);
	}
}
