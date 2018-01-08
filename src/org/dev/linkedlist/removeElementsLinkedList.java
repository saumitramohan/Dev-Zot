package org.dev.linkedlist;

public class removeElementsLinkedList {
	public ListNode removeElements(ListNode head, int val) { 
        if(head == null) 
            return head;
            while (head.val == val){
                if(head.next == null ){
                    return null;
                }
                 head = head.next;
        }
        
        ListNode currentPointer = head;
        ListNode prevPointer = head;
        
        while(currentPointer != null){
            if(currentPointer.val == val){
                currentPointer = currentPointer.next;
                prevPointer.next = currentPointer;
            }
            else{
                prevPointer = currentPointer;
                currentPointer = currentPointer.next;
            }
        }
     return head;   
    }

}
