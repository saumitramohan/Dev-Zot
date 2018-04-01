package org.dev.linkedlist;

import java.util.HashSet;
import java.util.Set;

class ListNode {
	int value;
	ListNode next;

	ListNode(int value) {
		this.value = value;
		this.next = null;
	}
}

public class DeleteDuplicates {

	public static ListNode DeleteDuplicates(ListNode head) {

		Set<Integer> set = new HashSet<Integer>();
		if (head == null || head.next == null) {
			return head;
		}
		String str = "Saumi";
		str = str + "abs";
		// ListNode nextNode = head;
		// ListNode prevNode = null;
		// while (nextNode != null) {
		// if (set.contains(nextNode.value)) {
		// prevNode.next = nextNode.next;
		// }
		// else {
		// set.add(nextNode.value);
		// prevNode = nextNode;
		// }
		// nextNode = nextNode.next;
		// }
		// return head;
		
		ListNode basePointer = head;
		ListNode prevPointer = head;
		ListNode currentPointer = head.next;
		while (basePointer.next != null) {
			while (currentPointer != null) {
				if (currentPointer.value == basePointer.value) {
					prevPointer.next = currentPointer.next;
				} else {
					prevPointer = currentPointer;
				}
				currentPointer = currentPointer.next;
			}
				basePointer = basePointer.next;
				prevPointer = basePointer;
				
				currentPointer = prevPointer.next;

		}
		return head;

	}

	public static void main(String args[]) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(1);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5 tyh);

		ListNode head = DeleteDuplicates(node);
		while (head != null) {
			System.out.println(head.value);
			head = head.next;
		}

	}

}
