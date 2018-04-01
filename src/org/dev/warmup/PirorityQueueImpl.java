package org.dev.warmup;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class PirorityQueueImpl {
	public static void main (String[] args){
		int array[] = {1,-2,4,5,-8,10};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i =0; i<array.length; i++) {
			pq.add(array[i]);
		}
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	} 
	
}
