package org.dev.bitmanupulation;

public class Masking {
	public static void main( String args[]) {
//		Input N : 10000000000000;
//		Input M : 10011
//		i = 2
//		j = 6
		int n = 189;
		int m = 12;
		System.out.println("Value");
		System.out.println(Integer.toBinaryString(n));
		int mask = prepareMask(4,2);
		int masked_value = mask & n;
		int m_shifted = m << 2;
		int result = masked_value | m_shifted ;
		System.out.println(Integer.toBinaryString(result));

	}
	public static int prepareMask(int start, int end) {
		int allOnes = ~0;
		int firstPartOfMask = (allOnes << (1 + start));
		int secondPartOfMask = ((1 << end) -1);
		int mask = firstPartOfMask | secondPartOfMask;
		return mask;
	}

}
