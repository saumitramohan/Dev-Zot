package org.dev.string;

public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ABCD";
		System.out.println("Reverse of the string is :" + StringReverse(str,0,str.length()-1));

	}

	private static String StringReverse(String str, int frontRunner, int endRunner) {
		// TODO Auto-generated method stub
		if (frontRunner > endRunner) {
			return str;
		}
		char[] strChar = str.toCharArray();
		char temp = strChar[frontRunner];
		strChar[frontRunner] = strChar[endRunner];
		strChar[endRunner] = temp;
		frontRunner++;
		endRunner --;
		return (StringReverse(new String(strChar), frontRunner, endRunner));
}

}
