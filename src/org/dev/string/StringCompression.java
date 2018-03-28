package org.dev.string;

public class StringCompression {
	public static void main(String args[]) { 
	char chars[] = {'a','a','b','b','b','c','c'};
	String str = "Saumi";
	str += "123";
	String str2 = "Saumi";
	System.out.println(str+" : "+str.hashCode());
	System.out.println(str2+" : "+str2.hashCode());


	String result = compressString(chars);
	System.out.println(result);
	}
	



public static String compressString(char[] chars) {
	int writeIndex = 0;
	int readIndex = 0;
	int length = chars.length;
	while (readIndex < length -1) {
		if(chars[readIndex] != chars[readIndex+1]) {
			int difference = readIndex - writeIndex;
			if(difference > 1 && difference < 9) {
				chars[writeIndex+1] = Integer.toString(difference).charAt(0);
				if(difference > 2) {
					for(int i = writeIndex +2; i < length -1; i++) {
						chars[i] = chars[i+1];
					}
				}
				length = length - difference;
				writeIndex = readIndex;
			}
			else if(difference > 9) {
				chars[writeIndex+1] = Integer.toString(difference).charAt(0);
				chars[writeIndex+2] = Integer.toString(difference).charAt(1);
			}
		}
		else {
			readIndex++;
			writeIndex = readIndex;
		}
	}
	
	return chars.toString();
	
}
}