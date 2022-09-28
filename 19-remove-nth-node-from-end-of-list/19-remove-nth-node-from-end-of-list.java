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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode l = head;
        int k = size(head) - n -1;
        if(k==-1)
            return head.next;
        int i=0;
        
        while(l!=null && l.next!=null)
        {
            
            if(i==k)
                l.next=l.next.next;
            i++;
            l = l.next;
        }
        return head;
    }
    
    public int size (ListNode head)
    {
        int n=0;
        while(head!=null)
        {
            n++;
            head=head.next;
        }
        return n;
    }
}