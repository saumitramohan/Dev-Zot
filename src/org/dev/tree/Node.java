package org.dev.tree;

public class Node {
	int key;
	Node left, right;
	int level;
	Node (int key){
		this.key = key;
		left = right = null;
		level = 0; 
	}

}
