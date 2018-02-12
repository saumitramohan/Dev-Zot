package org.dev.warmup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class ReductionArray {
	public static void main(String args[]) {
		PriorityQueue<Integer> pQueue =
                new PriorityQueue<Integer>();
		int resultSum = 0;
		int sum =0;
		int array[] = {1,2,3,4,5};
		
		for (int i =0; i< array.length;i++) {
			pQueue.add(array[i]);
		}
		while(!pQueue.isEmpty()) {
			if (pQueue.peek()!=null) {
				sum = pQueue.poll();
				if (pQueue.peek()!=null)
					sum+=pQueue.poll();
				else {
					break;
				}
			}
			else {
				break;
			}
			pQueue.add(sum);
			resultSum += sum;
		}
		
		System.out.println(resultSum);
	}

}
