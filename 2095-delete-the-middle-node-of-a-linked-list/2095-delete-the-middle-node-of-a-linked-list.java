/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Two solutions, differs only on the intialization of fast pointer which has an effect on how the deletion happens
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
        

        ListNode slow = head;
        ListNode fast = head.next.next;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow is now the node before the middle node
        slow.next = slow.next.next;
        
        return head;
    }
    
}
/*
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;

        ListNode slow = head;
        ListNode fast = head;
        
        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // slow node is now the middle node
        if(slow.next==null)
        {
            head.next=null;
            return head;
        }
        slow.val = slow.next.val;
        slow.next = slow.next.next;
        
        return head;
    }
    
}*/