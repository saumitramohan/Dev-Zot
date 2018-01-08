package org.dev.warmup;

public class MinimumCount {
	static int[] countOperationsToK(long[] kValues) {
		long numberofIntegers = kValues[0];
		int[] resultArray = new int[kValues.length - 1];
		for (int i = 0; i < numberofIntegers; i++) {
			long start = 0;
			long target = 128;
			int minimumSteps = minCount(start, target);
			System.out.println("minimumSteps" + minimumSteps);
			resultArray[i] = minimumSteps;

		}
		return resultArray;
	}
	// public static int minCount(long start, long result) {
	// int count =0;
	// if (start == result) {
	// return count;
	// }
	// else {
	// count ++;
	// start ++;
	// int newCount = countMinSteps(start, result, count);
	// return newCount;
	// }
	// }
	// public static int countMinSteps(long start, long result, int count) {
	//
	//
	//
	// count = Math.min(countMinSteps(start+1,result, count+1),
	// countMinSteps(start*2,result, count+1));
	// if(start == result)
	// return count;
	// if(start>result)
	// return -1;
	// return count;
	//
	//
	// }

	public static void main(String[] args) {
		long[] kValues = { 2, 5, 3 };
		int[] resultArray;
		resultArray = countOperationsToK(kValues);
		for (int i = 0; i < resultArray.length; i++) {
			System.out.println("    " + resultArray[i]);
		}
	}

	public static int minCount(long result, long start) {
		int count = 0;

		while (start > 0) {

			if (start % 2 == 0) {
				start = start / 2;
				count++;
				continue;
			}

			start--;
			count++;
		}
		return count;

	}
}
