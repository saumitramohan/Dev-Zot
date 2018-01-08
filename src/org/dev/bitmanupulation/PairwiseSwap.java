package org.dev.bitmanupulation;

public class PairwiseSwap {
	public static void main (String args[]) {
		int a = 5;
		System.out.println(Integer.toBinaryString(a));
		int output = swapBits(a);
		System.out.println(Integer.toBinaryString(output));

	}
	public static int swapBits(int a) {
		return (((a & 0xaaaaaaaa) >> 1) | ((a & 0x55555555) << 1));
		
	}
}
