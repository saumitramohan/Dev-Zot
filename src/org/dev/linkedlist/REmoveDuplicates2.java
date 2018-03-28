package org.dev.linkedlist;

public class REmoveDuplicates2 {
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	class Solution {
		
	    public ListNode deleteDuplicates(ListNode head) {
	    LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<Integer,Integer>();    
	        ListNode currentNode = head;
	        ListNode n_head = new ListNode(0);
	        ListNode temp = n_head;
	        if ( head == null || head.next == null)
	            return head;
	        while (currentNode!=null){
	            if (hm.containsKey(currentNode.val)){
	                int value = hm.get(currentNode.val);
	                value ++;
	                hm.put(currentNode.val,value);
	            }
	            else
	                hm.put(currentNode.val,1);
	            currentNode = currentNode.next;
	        }
	        for (Map.Entry m:hm.entrySet()){
	            Integer value = (Integer) m.getValue();
	            if (value == 1){
	                Integer value_new = (Integer) m.getKey();
	                ListNode node = new ListNode(value_new);
	                temp.next = node;
	                temp = node;
	            }
	        }
	        return n_head.next;
	}
	}
	

}
