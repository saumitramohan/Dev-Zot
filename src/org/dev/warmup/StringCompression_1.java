package org.dev.warmup;

public class StringCompression_1 {

	public static void main(String[] args) {
		String str = "aaaabbbbccccddddd";
		System.out.println("Compressed String is ::" + StringCompression(str));
	}

	public static String StringCompression(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 0;
		int baseIndex = 0;
		int forwardIndex = 1;
		
		for (int i =0; i< str.length(); i++) {
			count ++;
			if (i+1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i));
				sb.append(count);
				count =0;
			}
		}
//		while (forwardIndex < str.length()) {
//			if (forwardIndex != str.length() - 1 && str.charAt(baseIndex) == str.charAt(forwardIndex)) {
//				count++;
//			} else {
//				sb.append(str.charAt(baseIndex));
//				sb.append(count);
//				baseIndex = forwardIndex;
//				count = 1;
//
//			}
//			System.out.println(forwardIndex);
//			forwardIndex++;
//		}

		// for (int i = 0; i < str.length(); i++) {
		// count++;
		// if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
		// sb.append(str.charAt(i));
		// sb.append(count);
		// count = 0;
		// }
		// }
		return sb.toString();

	}
}
