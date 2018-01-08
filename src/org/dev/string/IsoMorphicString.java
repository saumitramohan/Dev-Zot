package org.dev.string;

import java.util.HashMap;

public class IsoMorphicString {
	
	
	    public boolean isIsomorphic(String s, String t) {
	        HashMap <Character, Integer> sMap = new HashMap <Character, Integer>();
	        HashMap <Character, Integer> tMap = new HashMap <Character, Integer>();
	        if (s.length() != t.length())
	            return false;
	        for(int i=0; i < s.length(); i++){
	            int sIndex = sMap.getOrDefault (s.charAt(i), -999);
	            int tIndex = tMap.getOrDefault (t.charAt(i), -999);
	            if (sIndex != tIndex){
	                return false;
	            }
	            sMap.put(s.charAt(i), i);
	            tMap.put(t.charAt(i), i);
	        }
	        return true;
	        
	}


}
