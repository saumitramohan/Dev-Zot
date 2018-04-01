package org.dev.tree;

import java.util.LinkedList;
import java.util.Queue;

public class IterativeBFS {
	public static void main (String args[]) {
		Node node = new Node(10);
		node.left = new Node(5);
		node.right = new Node (15);
		node.right.left = new Node (14);
		node.right.right = new Node (16);
		node.left.left = new Node (4);
		node.left.right = new Node (1);
		printLevelOrder (node);
	}
	
	public static void printLevelOrder(Node node) {
		//LinkedList<LinkedList<Integer>> resultlist = new LinkedList();
		Queue <Node> queue = new LinkedList();
		queue.add(node);
		int levelNodes = 0;
		int level = 0;
		while (!queue.isEmpty()) {
			levelNodes = queue.size();
			while (levelNodes > 0) {
				Node temp = queue.poll();
				System.out.print("   At level :"+ level + "  "+ temp.key);
				if (temp.left!= null) {
					queue.add(temp.left);
				}
				if (temp.right!= null) {
					queue.add(temp.right);
				}
				levelNodes --;
			}
			level ++;
			System.out.println("");
			
		}
		
	}
}
