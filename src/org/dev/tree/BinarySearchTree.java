package org.dev.tree;

public class BinarySearchTree {

	public class Node{
		private int data;
		private Node leftNode;
		private Node rightNode;
		Node (int data){
			this.data = data;
			leftNode = null;
			rightNode = null;
		}
	}
	Node root;
	BinarySearchTree(){
		root = null;
	}
	private Node Insert (Node node, int data) {
		if (node == null) {
			node = new Node (data);
			return node;
		}
		else {
			if (data < node.data) {
				node.leftNode = Insert (node.leftNode, data);
			}
			else if (data > node.data) {
				node.rightNode = Insert (node.rightNode, data);
			}
		}
		return node;
	}
	public void InsertBST(int data) {
		this.root =  Insert (this.root, data);
	}
	
	public void InOrderTraversal() {
		InOrderBSTTraversal(this.root);
	}
	private void InOrderBSTTraversal(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		InOrderBSTTraversal (node.leftNode);
		System.out.println(node.data);
		InOrderBSTTraversal (node.rightNode);

		
	}
	
}
