package org.dev.recursion;

import java.util.HashMap;

public class MinStairs {
	class Solution {
	    HashMap <Integer, Integer> memo = new HashMap<Integer, Integer>();
	    public int minCostClimbingStairs(int[] cost) {
	        return dp (cost, -1);   
	    }
	    public int dp (int cost[], int step){
	         if (step >= cost.length-2){
	            return 0;
	        }
	        if (memo.containsKey(step)){
	            return memo.get(step);
	        }
	        int ans =  Math.min (cost[step+1] + dp(cost, step+1), cost[step+2] + dp(cost, step+2));
	        memo.put(step, ans);
	        return ans;
	    }
	}

}
