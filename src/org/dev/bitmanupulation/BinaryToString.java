package org.dev.bitmanupulation;

import java.util.Scanner;

public class BinaryToString {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		String inputString = sc.nextLine();
		Double inputInteger = Double.parseDouble(inputString);
		if (inputInteger >=1 || inputInteger <= 0) {
			System.out.println("Error1");
		}
		else {
			sb.append(Binary2String(inputInteger));
		}
		System.out.println(sb.toString());

	}

	private static String Binary2String(double inputDouble) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		while (inputDouble > 0 && sb.length() < 10) {
			if(sb.length() > 32){
				return "Error";
			}
			inputDouble = inputDouble * 2.0;
			if (inputDouble >= 1.0) {
				sb.append(1);
				inputDouble = inputDouble - 1.0;
			}
			else {
				sb.append(0);
			}
			
		}
		return sb.toString();
	}
}
