package org.dev.recursion;

public class Stairway {
	
	public static void main(String args[]) {
		int steps= 100;
		int numberOfWays = stairwayCount(steps);
		System.out.println("Number of ways"+ numberOfWays);
	}

	private static int stairwayCount (int steps) {
		return stairwayCountMemo (steps, new int[steps+1]);
	}
	private static int stairwayCountMemo(int steps, int[] memo) {
		if(steps < 0)
			return 0;
		else if(steps == 0) {
			return 1;
		}
		if(memo [steps] == 0) {
			memo [steps] = stairwayCountMemo(steps-1, memo) + stairwayCountMemo (steps-2, memo) + stairwayCountMemo(steps-3, memo);
		}
			return memo[steps];
	}
}
