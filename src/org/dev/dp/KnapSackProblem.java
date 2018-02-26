package org.dev.dp;

public class KnapSackProblem {
	
	public static void main (String[] args) {
		int val[] = new int[] {60, 100, 120};
		int wt[] = new int[] {10, 20, 30};
		int maximumWeight = 50;
		int index = wt.length;
		System.out.print("Knapscak answer+"+Knapsack(val,wt,index,maximumWeight));
	}

	private static int Knapsack(int[] val, int[] wt, int index, int maximumWeight) {
		if (index < 0) {
			return 0;
		}
		if (wt[index-1] > maximumWeight) {
			return Knapsack(val,wt,index-1,maximumWeight);
		}
		else {
			return Math.max(val[index-1]+Knapsack(val,wt,index-1,maximumWeight-wt[index-1]), Knapsack(val,wt,index-1,maximumWeight));
		}
	}

}
