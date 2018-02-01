package org.dev.tree;

public class MinimalTree {
	
	  //Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	class Solution {
	    public TreeNode sortedArrayToBST(int[] nums) {
	        return sortedAToBST(nums,0,nums.length-1);    
	    }
	    public TreeNode sortedAToBST (int[] nums, int start, int end){
	    if (start > end){
	        return null;
	    }
	    int mid = (start + end)/2;
	    TreeNode node = new TreeNode (nums[mid]);
	    node.left = sortedAToBST(nums,start, mid-1);
	    node.right = sortedAToBST(nums,mid+1,end);
	    return node;
	    }
	}

}
