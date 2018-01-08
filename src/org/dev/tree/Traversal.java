package org.dev.tree;

public class Traversal	{
	
	public static void main (String args[]) {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		//bt.root.left = new Node(2);
		bt.root.right = new Node (3);
		//bt.root.left.left = new Node (4);
		//bt.root.left.right = new Node (5);
		bt.root.right.left = new Node (6);
		bt.root.right.right = new Node(7);
		//bt.preOrderPrint();
		//System.out.println(bt.getHeight());
		//bt.printLevelOrder();
		//bt.InOrderTraversalPrint();
		bt.CountLeafNode();
		bt.CountHalfNodes();

	}
}


