package org.dev.warmup;

public class BinarySearchTree {
	public class Node {
		int data = 0;
		Node left, right;

		Node(int value) {
			this.data = value;
			left = right = null;
		}
	}

	public static Node rootNode;

	BinarySearchTree() {
		rootNode = null;
	}

	void InsertBST(int key) {

		Node newNode = new Node(key);
		if (rootNode == null) {
			rootNode = newNode;
			return;
		}
		Node currentNode = rootNode;
		Node parentNode = null;
		while (true) {
			parentNode = currentNode;
			if (key < currentNode.data) {
				currentNode = currentNode.left;
				if (currentNode == null) {
					currentNode = newNode;
					parentNode.left = currentNode;
					return;
				}
			} else {
				currentNode = currentNode.right;
				if (currentNode == null) {
					currentNode = newNode;
					parentNode.right = currentNode;
					return;
				}

			}
		}
	}
	
	void print() {
		System.out.println("Inorderorder");
		printInorderBST(rootNode);
		System.out.println("Preorder");
		printPreorderBST(rootNode);
		System.out.println("Postorder");
		printPostorderBST(rootNode);



	}
	
	void printInorderBST(Node node) {
		if(node!=null ) {
			printInorderBST(node.left);
			System.out.println(node.data);
			printInorderBST(node.right);
		}
	}
	
	void printPreorderBST(Node node) {
		if(node!=null ) {
			System.out.println(node.data);
			printPreorderBST(node.left);
			printPreorderBST(node.right);
		}
	}
	
	void printPostorderBST(Node node) {
		if(node!=null ) {
			printPreorderBST(node.left);
			printPreorderBST(node.right);
			System.out.println(node.data);

		}
	}
	
	public static void main(String []  args ) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.InsertBST(1);
		tree.InsertBST(5);
		tree.InsertBST(3);
		tree.InsertBST(4);
		tree.InsertBST(2);

		tree.print();
		
	}

}
