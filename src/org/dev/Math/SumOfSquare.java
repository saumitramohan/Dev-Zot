package org.dev.Math;

public class SumOfSquare {
	public static void main(String args[]) {
	int c = 4;
	double d = (int) c;
	int b = (int) Math.sqrt(d);
	while (b > 0) {
		Double k = Math.sqrt(d-b*b);
		System.out.println("k"+k);

		if (k == 0 || (k == Math.floor(k)) && !Double.isInfinite(k) ) {
			System.out.println("Yo");
			break;
		}
		else {
			b = b-1;
		}
	}
	}

}
