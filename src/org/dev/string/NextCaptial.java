package org.dev.string;

public class NextCaptial {

	static String[] strengthenPasswords(String[] passwords) {
		// Replace any instance of 5
		int resultIndex = 0;
		String test = "nextcapital";
		String[] resultPassWords = new String[passwords.length];
		for (String s : passwords) {
			boolean flag = false;
			StringBuilder sb = new StringBuilder();
			int length = s.length();

			for (int index = 0; index < s.length(); index++) {
				if (s.charAt(index) == 's' || s.charAt(index) == 'S')
					sb.append(5);

				else
					sb.append(s.charAt(index));
			}
			if (length % 2 != 0) {
				System.out.println("Inside :"+sb.toString());

				Character digitCheck = sb.charAt(length / 2);
				if (Character.isDigit(digitCheck)) {
					int value = Character.getNumericValue(digitCheck);
					value *= 2;
					if (value < 10) {
						sb.replace(length / 2, length / 2+1, Integer.toString(value));
					} else {
						String st = sb.substring(length / 2 + 1, length);
						sb.replace(length / 2, length / 2 + 1, Integer.toString(value));
						//sb.insert(length / 2 + 2, st);
						length ++;
					}
				}
			}
			for (int index = 0; index < sb.length(); index++) {
				if (sb.charAt(index) == 'n' || sb.charAt(index) == 'N') {
					if (index + 10 < length && !flag) {
						String nc = sb.substring(index, index + 11);
						if (test.compareTo(nc.toLowerCase()) == 0) {
							StringBuilder sb1 = new StringBuilder();
							String string = sb.substring(index, index + 4);
							sb1.append(string);
							sb1.reverse();
							sb.replace(index, index + 4, sb1.toString());
						}
						flag = true;

					}
				}
			}
			//
			if (sb.length() > 1 && sb.length() % 2 != 0) {
				if (Character.getNumericValue(sb.charAt(length / 2)) > Integer.MIN_VALUE) {

				}

			}
			if (length % 2 == 0) {
				Character start = sb.charAt(0);
				Character end = sb.charAt(length - 1);
				if (Character.isUpperCase(start)) {
					start = Character.toLowerCase(start);
				} else {
					start = Character.toUpperCase(start);
				}
				if (Character.isUpperCase(end)) {
					end = Character.toLowerCase(end);
				} else {
					end = Character.toUpperCase(end);
				}
				sb.replace(0, 1, end.toString());
				sb.replace(length - 1, length , start.toString());

			}
			resultPassWords[resultIndex] = sb.toString();
			resultIndex++;

		}
		return resultPassWords;
	}

	public static void main(String args[]) {
		String[] array = { "nextc6pital", "Doge", "nExTcapITalxnextcapital", "ThreeSThree" };

		array = strengthenPasswords(array);
		for (String s : array) {
			System.out.println(s);
		}
	}

}
