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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode t = new ListNode(0);
        t = head;
        
        while(t!=null&& t.next!=null)
        {
            if(t.next.val == t.val)
                t.next = t.next.next;
            else
                t = t.next;
        }
        
        return head;
        
    }
}