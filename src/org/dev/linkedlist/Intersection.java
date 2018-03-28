package org.dev.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
	
	
	 // Definition for singly-linked list.
	   class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 
	    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
	        Set <ListNode> set = new HashSet <ListNode>();
	        while (headA != null){
	            set.add (headA);
	            headA = headA.next;
	        }
	        while (headB !=null){
	            if(set.contains(headB)){
	                return headB;
	            }
	            headB = headB.next;
	        }
	        return null;
	        
	    }
	

}
