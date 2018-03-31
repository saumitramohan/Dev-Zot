package org.dev.heap;

import java.util.Comparator;
import java.util.PriorityQueue;
 class PriorityQueueReverse implements Comparator<Integer> {

	public int compare(Integer one, Integer two) {
		return two - one;
	}

}

public class MaximumKthElement {



	public static void main(String args[]) {
		PriorityQueueReverse pqr = new PriorityQueueReverse();
		PriorityQueue<Integer> pqueue = new PriorityQueue<>(pqr);
		pqueue.add(1);
		pqueue.add(2);
		pqueue.add(-1);
		System.out.println(pqueue.remove());

	}

}
