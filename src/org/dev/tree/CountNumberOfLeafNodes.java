package org.dev.tree;

public class CountNumberOfLeafNodes {
	
	public static int CountNumberOfLeafNode (Node node) {
		if (node == null) {
			return 0;
		}
		if (node.left == null && node.right == null) {
			return 1;
		}
		else {
			return CountNumberOfLeafNode(node.left) + CountNumberOfLeafNode(node.right);
		}
	}

}
