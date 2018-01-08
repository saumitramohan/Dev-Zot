package org.dev.tree;

public class CountHalfNodes {

	public static int CountNumberOfHalfNodes (Node node) {
		if (node == null) {
			return 0;
		}
		if ((node.left == null && node.right != null) || (node.left != null && node.right == null)) {
			return 1;
		}
		else {
			return CountNumberOfHalfNodes(node.left) + CountNumberOfHalfNodes(node.right);
		}
	}
}
