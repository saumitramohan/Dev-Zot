package org.dev.warmup;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        // Find middle of the linked list
        // reverse it
        // Compare
        if(head == null || head.next == null ){
            return true;
        }
        ListNode middle = findMiddle (head);
        middle = reverse (middle);
        return comparePallindrome (head, middle);
        
    }
    public static ListNode findMiddle (ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast !=null && fast.next !=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    public static ListNode reverse (ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;
        while (curr != null){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
        }
        return prev;
    }
    public static boolean comparePallindrome (ListNode head, ListNode middle){
        while (head !=null && middle!=null){
            if (head.val != middle.val){
                return false;
            }
            head = head.next;
            middle = middle.next;
        }
        return true;
    }
}