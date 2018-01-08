package org.dev.tree;

public class ImplementBST {
	public static void main (String args[]) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.InsertBST(0);
		bst.InsertBST(2);
		bst.InsertBST(4);
		bst.InsertBST(16);
		bst.InsertBST(8);
		bst.InsertBST(20);
		bst.InOrderTraversal();

	}

}
