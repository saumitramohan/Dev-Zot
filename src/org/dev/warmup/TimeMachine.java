package org.dev.warmup;

public class TimeMachine {
	
	public static void main(String args[]) {
		char array[] = {'>','>','>','*','>','*','<','*','>','>'};
		int sum[] = new int[array.length];
		int value =0;
		for (int i =0; i < array.length; i++) {
			if (i < array.length -2 && array[i+2] == '*') {

				if (array[i] == '>'){
					sum[i+2] = 2;
				}
				else if (array[i] == '<')
					sum [i+2] = -2;
				else {
					sum [i+2] = 2*sum[i];
					sum[i] = 0;

				}
				
			}
			else if (array[i] == '>') {
				sum[i] = 1;
			}
			else if (array[i] == '<')
				sum[i] = -1;
		}
		for (int i =0; i< sum.length;i++ ) {
			System.out.println(sum[i]);
			value = value+sum[i];
		}
		System.out.println("Result::"+value);
	}

}
