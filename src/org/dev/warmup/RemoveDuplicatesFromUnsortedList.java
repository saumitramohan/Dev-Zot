package org.dev.warmup;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class RemoveDuplicatesFromUnsortedList {

	public static void main(String args[]) {
		ListNode node = new ListNode(0);
		node.next = new ListNode(1);
		node.next.next = new ListNode(6);
		node.next.next.next = new ListNode(0);
		node.next.next.next.next = new ListNode(0);
		node = removeDuplicates(node);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	public static ListNode removeDuplicates(ListNode head) {
		if (head == null)
			return head;
	
	ListNode currentNode = head;
	ListNode loopNode = head.next;
	ListNode prevNode = head;

	while (currentNode.next != null) {
		while (loopNode != null) {
			if (loopNode.val == currentNode.val) {
				prevNode.next = loopNode.next;
				loopNode = loopNode.next; 
				
			}
			else {
				loopNode  = loopNode.next;
				prevNode = prevNode.next;
			}
		}
		currentNode = currentNode.next;
		loopNode = currentNode.next;
		prevNode = currentNode;
	}
	return head;

}
}