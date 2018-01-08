package org.dev.warmup;

import java.util.Map;
import java.util.TreeMap;

public class SubString_pallindrome {     

 static void palindromeSubStrs(String s)
 {
	 int str_len = s.length();
     TreeMap<String , Integer> map = new TreeMap<>();
   
     int[][] R = new int[2][str_len+1];

     s = "!" + s + "$";
   
     for (int j = 0; j <= 1; j++)
     {
         int radius = 0;  
         R[j][0] = 0;
   
         int i = 1;
         while (i <= str_len)
         {
             while (s.charAt(i - radius - 1) == s.charAt(i + 
                                             j + radius))
            	 radius++;  
 
             R[j][i] = radius;
             int k = 1;
             while ((R[j][i - k] != radius - k) && (k < radius))
             {
                 R[j][i + k] = Math.min(R[j][i - k], 
                		 radius - k);
                 k++;
             }
             radius = Math.max(radius - k,0);
             i += k;
         }
     }
   
     s = s.substring(1, s.length()-1);
  
     map.put(s.substring(0,1), 1);
     for (int i = 1; i < str_len; i++)
     {
         for (int j = 0; j <= 1; j++)
             for (int radius = R[j][i]; radius > 0; radius--)
                map.put(s.substring(i - radius - 1,  i - radius - 1
                                    + 2 * radius + j), 1);
         map.put(s.substring(i, i + 1), 1);
     }

    System.out.println("Below are " + (map.size())
                        + " palindrome sub-strings");
 
 }
   
 // Driver program
 public static void main(String args[])
 {
     palindromeSubStrs("abaaa");
 }
}