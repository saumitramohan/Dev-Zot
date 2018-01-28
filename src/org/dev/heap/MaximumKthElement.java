package org.dev.heap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MaximumKthElement {
	
	static class PQsort implements Comparator<Integer> {
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
	
	public static void main (String args[]) {
		PQsort pqs = new PQsort();
		PriorityQueue <Integer> queue = new PriorityQueue<Integer>(pqs);
		queue.add(1);
		queue.add(4);
		queue.add(5);
		queue.add(10);
		Iterator<Integer> itr2 = queue.iterator();		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}
}
