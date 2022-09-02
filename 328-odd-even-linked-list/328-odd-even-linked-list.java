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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null)
            return null;
        
        ListNode odd = head;
        ListNode evenPtr = head.next;
        ListNode evenHead = evenPtr;
        
        while(evenPtr!=null && evenPtr.next!=null)
        {
            // odd at position 0, even at position 1, even.next is 2 which is the next odd position
            odd.next = evenPtr.next;
            odd = odd.next;
            evenPtr.next = odd.next;
            evenPtr = evenPtr.next;
        }
        
        odd.next = evenHead;
        
        return head;
    }
}