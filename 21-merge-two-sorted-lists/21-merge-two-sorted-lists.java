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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode t = new ListNode(0);
        ListNode head = t;
        
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        while(l1!=null || l2!=null)
        {
            if(l1!=null)
                a=l1.val;
            else a = Integer.MAX_VALUE;
            
            if(l2!=null)
                b = l2.val;
            else b = Integer.MAX_VALUE;
        
            
            if(a<=b)
            {
                ListNode c = new ListNode(a);
                t.next = c;
                t=t.next;
                l1=l1.next;
            
            }
            else
            {
                ListNode c = new ListNode(b);
                t.next = c;
                t=t.next;
                l2 = l2.next;
            }
        }
        
        return head.next;
        
    }
}