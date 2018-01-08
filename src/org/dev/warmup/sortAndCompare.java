package org.dev.warmup;

import java.util.Arrays;

public class sortAndCompare {
	public static boolean sortandCompare(String a1, String a2){
        char str1Array[] = a1.toCharArray();
        char str2Array[] = a2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        
        String s1 = new String (str1Array);
        String s2 = new String (str2Array);
         
        // sort tempArray
            if(s1.equals(s2)){
                return true;
            }
        return false;
    }
	public static void main(String args[]) {
		boolean result;
		String a1 = "abcd";
		String a2 = "bcad";
		result = sortandCompare(a1, a2);
		if(result) {
			System.out.println("True");
		}
		else
		System.out.println("false");
	}
}
