package org.dev.warmup;

public class OddAndEven {
	public static void main(String args[]) {
		int array[] = {2,1,3,4,7,9,24,98};
		int oddPointer = 0;
		int evenPointer = 1;
		while (oddPointer < array.length  && evenPointer < array.length) {
			while (array[evenPointer] %2 == 0 ) {
				evenPointer+=2;
			}
			while (array[oddPointer] %2 != 0) {
				oddPointer += 2;
			}
			int temp = array[oddPointer];
			array[oddPointer] = array[evenPointer];
			array[evenPointer] = temp;
			oddPointer += 2;
			evenPointer += 2;
		}
		for (int i =0; i< array.length; i++)
			System.out.print(array[i]+",");
	}
}
