package org.dev.recursion;

import java.util.ArrayList;

public class PowerSets {
	
	static ArrayList<ArrayList<Integer>> getSubsets (ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allsubsets;
		if(set.size() == index) {
			allsubsets = new ArrayList<ArrayList<Integer>>();
			allsubsets.add(new ArrayList<Integer>());
			System.out.println ("added null element");

		}
		else {
			System.out.println ("Recursive call");
			allsubsets = getSubsets(set, index+1);
			System.out.println ("After Recursive call");
			int item = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			System.out.println("**********");

			for(ArrayList<Integer> subSet : allsubsets) {
				System.out.println("loop");

				ArrayList<Integer> newSubSet = new ArrayList<>();
				newSubSet.addAll(subSet);
				newSubSet.add(item);
				moreSubsets.add(newSubSet);
				for(Integer s: newSubSet) {
					System.out.print(s);
					if(s == null) {
						System.out.print("null");

					}
					System.out.print(",");
				}
				System.out.println("----------------------------");
			}
			allsubsets.addAll(moreSubsets);
		}
		return allsubsets;
		
	}
	public static void main(String args[]) {
		ArrayList <Integer> set = new ArrayList<>();
		set.add(1);
		set.add(2);
		set.add(3);
		ArrayList<ArrayList<Integer>> getSubsets = getSubsets (set, 0);
//		for(ArrayList<Integer> innerList : getSubsets) {
//		    for(Integer number : innerList) {
//		        System.out.print(number);
//		        System.out.print(",");
//		    }
//		    System.out.println();
		    
		}
		
		
	}


