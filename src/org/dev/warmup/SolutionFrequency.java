package org.dev.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SolutionFrequency {

	public static String frequencySort(String s) {        
	        ArrayList <SortByFrequency> list = new ArrayList<>();
	        HashMap <Character, Integer> map = new HashMap<>();
	        
	        for (int i=0; i< s.length(); i++){
	            if (!map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i), 1);
	            }
	            else{
	                int val = map.get(s.charAt(i));
	                val ++;
	                 map.put(s.charAt(i), val);
	            }
	        }
	        for (Map.Entry<Character, Integer> entry : map.entrySet()){
	            SortByFrequency object = new SortByFrequency(entry.getKey(), entry.getValue());
	            for (int i =0; i <entry.getValue(); i++) {
		            list.add(object);

	            }
	        }
	        Collections.sort(list, new FrequencyComparator());
	        StringBuilder sb = new StringBuilder();
	        for (int i =0; i<list.size(); i++){
	            sb.append(list.get(i).c);
	        }
	        return sb.toString();
	        
	    }
	
	public static void main(String args[]) {
		String s = "Aabb";
		System.out.println(frequencySort(s));
	}

	
}
 class SortByFrequency {

	char c;
	int frequency;

	public SortByFrequency(char c, int frequency) {
		this.c = c;
		this.frequency = frequency;
	}
}

 class FrequencyComparator implements Comparator<SortByFrequency> {
	public int compare(SortByFrequency objectOne, SortByFrequency objectTwo) {
		if (objectOne.frequency > objectTwo.frequency) {
			return -1;
		}
		if (objectOne.frequency < objectTwo.frequency) {
			return 1;
		} else {
			return (int) objectOne.c - (int) objectTwo.c;
		}
	}
}


