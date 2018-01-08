package org.dev.recursion;
import java.util.ArrayList;

public class PowerSets2 {

	public static void main(String args[]) {
		ArrayList <Integer> set = new ArrayList<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		ArrayList <ArrayList<Integer>> result = powerSet(set,0);
		
	}

	private static ArrayList<ArrayList<Integer>> powerSet(ArrayList<Integer> set, int index) {
		// TODO Auto-generated method stub
		ArrayList <ArrayList<Integer>> resultSet = null;
		if(set.size() == index) {
			resultSet = new ArrayList<ArrayList<Integer>>();
			ArrayList <Integer> list = new ArrayList <Integer>();
			resultSet.add(list);
		}
		else {
			resultSet = powerSet(set,index+1);
			int element = set.get(index);
			ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList <Integer> subset : resultSet) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.addAll(subset);
				list.add(element);
				moreSubsets.add(list);
			}
			resultSet.addAll(moreSubsets);
		}
		return resultSet;
	}
}
