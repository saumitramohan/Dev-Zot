package org.dev.tree;

import java.util.Stack;

public class BinaryTree {
	Node root;
	BinaryTree() {
		root = null;
	}

	void printPreOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println("Value:" + node.key);
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	
	void printInOrder(Node node) {
		if(node == null) {
			return;
		}
		printInOrder(node.left);
		System.out.println("Value:" + node.key);
		printInOrder(node.right);
	}
	
	void printPostOrder(Node node) {
		if(node == null) {
			return;
		}
		printPostOrder(node.left);
		printPostOrder(node.right);
		System.out.println("Value:" + node.key);

	}

	public void preOrderPrint() {
		System.out.println("Inside preOrderPrint");
		printPreOrder(this.root);
	}
	public void inOrderPrint() {
		System.out.println("Inside inOrderPrint");
		printInOrder(this.root);
	}
	public void postOrderPrint() {
		System.out.println("Inside preOrderPrint");
		printPostOrder(this.root);
	}
	
	public int getHeight() {
		return height(this.root);
	}
	
	void printLevelOrder() {
		int h = getHeight();
		for (int i =1;i <=h;i++) {
			printGivenLevel(this.root,i);
		}
	}
	
	  void printGivenLevel (Node root ,int level)
	    {
	        if (root == null)
	            return;
	        if (level == 1)
	            System.out.print(root.key + " ");
	        else if (level > 1)
	        {
	            printGivenLevel(root.left, level-1);
	            printGivenLevel(root.right, level-1);
	        }
	    }
	
	public int height (Node node) {
		if (node == null) {
			return 0;
		}
		else {
		int lHeight = height (node.left);
		int rHeight = height (node.right);
		return 1 + Math.max(lHeight,rHeight);
		
	}
	}
	public void InOrderTraversalPrint () {
		this.InOrderTraversal(this.root);
	}

	private void InOrderTraversal(Node root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return;
		}
		Stack <Node> stack = new Stack<Node>();
		Node node = root;
		while(node != null) {
			stack.push(node);
			node = node.left;
		}
		while (stack.size() > 0) {
			node =  stack.pop();
			System.out.println("Data :: "+node.key);
			if (node.right != null) {
				node = node.right;
				 while (node != null) {
	                    stack.push(node);
	                    node = node.left;
	                }
			}
		}
		
		
	}
	public void CountLeafNode() {
		System.out.println(CountNumberOfLeafNodes.CountNumberOfLeafNode(this.root));
	}
	public void CountHalfNodes() {
		System.out.println(CountHalfNodes.CountNumberOfHalfNodes(this.root));
	}
	
	

}
