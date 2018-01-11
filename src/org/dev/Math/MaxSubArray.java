package org.dev.Math;

public class MaxSubArray {

	class Solution {
	    public int maxSubArray(int[] nums) {
	        int max_sum_so_far = 0;
	        int max = Integer.MIN_VALUE;
	        for (int i = 0; i < nums.length; i++ ){
	            max_sum_so_far = max_sum_so_far + nums[i];
	            if (max_sum_so_far > max){
	                max = max_sum_so_far;
	            }
	            if (max_sum_so_far < 0){
	                max_sum_so_far =0;
	            }
	        }
	        return max;
	    }
	}
}
