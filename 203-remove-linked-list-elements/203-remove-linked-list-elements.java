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
    public ListNode removeElements(ListNode head, int val) {
        
        if(head==null)
            return null;
        
        ListNode p = head;
        
        while(head!=null)
        {
            if(head.next!=null && head.next.val==val)
            {
                head.next = head.next.next;
            }
            else
                head = head.next;
        }
        
        if(p.val==val)
        {
            if(p.next!=null)
            {
                p.val = p.next.val;
                p.next = p.next.next;
            }
            else p = null;
        }
        
        return p;
        
    }
}