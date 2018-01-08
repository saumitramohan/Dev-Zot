package org.dev.tree;

import org.dev.tree.MergeTwoBinaryTree.TreeNode;

public class MaxTree {
	
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	     TreeNode(int x) { val = x; }
	  }
	class Solution {
	    int sum =0;
	    public TreeNode convertBST(TreeNode root) {

	       if (root != null){
	           convertBST(root.right);
	            sum = sum + root.val;
	           root.val = sum;
	           convertBST(root.left);
	           
	       }
	        return root;
	        
	        
	        
	        
	    }
	  
	}
	}


