package org.dev.bitmanupulation;

public class Conversion {
	public static void main (String args[]) {
		int a = 29;
		int b = 15;
		int d = a^b;
		int count = 0;
		System.out.println(Integer.toBinaryString(d));
		for (int c = a ^ b; c !=0; c = c >>> 1) {
			count += c & 1; 
		}
		System.out.println(count);

	}

}
