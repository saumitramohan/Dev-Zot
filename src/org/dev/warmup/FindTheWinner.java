package org.dev.warmup;

public class FindTheWinner {

	public static void main(String[] args) {
		int array[] = { 3, 1, 2, 3, 3, 2, 1, 3 };
		String gameType = "Odd";
		System.out.println("Winner is :" + PredictWinner(array, gameType));
	}

	public static String PredictWinner(int[] array, String gameType) {
		int andreaArray[] = new int[array[0]];
		int mariaArray[] = new int[array[0]];
		int andreaSum = 0;
		int mariaArraySum = 0;

		for (int i = 1; i <= array[0]; i++) {
			andreaArray[i - 1] = array[i];
		}
		for (int i = array[0] + 2; i < array.length; i++) {
			andreaArray[i - array[0] - 2] = array[i];
		}
		for (int i = 0; i < andreaArray.length; i += 2) {
			if (gameType == "Odd") {
				if ( i+ 1 < andreaArray.length) {
					andreaSum = andreaArray[i + 1] - mariaArray[i + 1];
					mariaArraySum = mariaArray[i + 1] - andreaArray[i + 1];
				}
				
			} else {
				andreaSum = andreaArray[i] - mariaArray[i];
				mariaArraySum = mariaArray[i] - andreaArray[i];
			}

		}
		if (andreaSum > mariaArraySum) {
			return "andrea";
		}
		else if (andreaSum < mariaArraySum) {
			return "Maria";
		}

		return "tie";

	}

}
