package org.dev.Math;

public class powerOfFour {
	public boolean isPowerOfThree(int n) {
		int power = (int) Math.floor((Math.log(Integer.MAX_VALUE) / Math.log(3)));
		int an = (int) Math.pow(3, power);
		return (n > 0 && ((Math.pow(3, power) % n) == 0));
	}
}
