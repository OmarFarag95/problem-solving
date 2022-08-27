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
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head==null)
            return null;
        ListNode rev = new ListNode(head.val);
        
        while(head.next!=null)
        {
            ListNode new_node = new ListNode(head.next.val);
            new_node.next=rev;
            rev = new_node;
            head=head.next;
        }
        
        return rev;
    }
}