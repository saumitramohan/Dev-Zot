package org.dev.warmup;

public class StringCompression {

	public static void main(String args[]) {
		String inputString = "aabbbbccccd";
		String result = stringCompression(inputString);
		System.out.println(result);
		
	}

	private static String stringCompression(String inputString) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int index = 0; index < inputString.length(); index++) {
			count ++;
			if(inputString.charAt(index)!=inputString.charAt(index+1) || index+1 >= inputString.length()) {
				sb.append(inputString.charAt(index));
				sb.append(count);
			}
		}
		return sb.length() < inputString.length() ? sb.toString():inputString;
	}
}
