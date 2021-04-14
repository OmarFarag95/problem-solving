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
    public ListNode partition(ListNode head, int x) {

        ListNode n = head;
        ListNode first = new ListNode(0);
        ListNode t_first = first;
        ListNode second = new ListNode(0);
        ListNode t_second = second;

        while (n != null) {
            if (n.val < x) {
                first.next = n;
                first = first.next;
            } else {
                second.next = n;
                second = second.next;
            }
            n = n.next;
        }
        second.next = null;

        first.next = t_second.next;
        return t_first.next;
    }

    /*public ListNode partition(ListNode head, int x)
    {
        ListNode first = new ListNode(0);
        ListNode t1 = first;
        ListNode second  = new ListNode(0);
        ListNode t2 = second;
        
        
        
        while(head!=null)
        {
            if(head.val<x)
            {
                first.next = head;
                first = first.next;
            }
            else
            {
                second.next = head;
                second = second.next;
            }
            
            head=head.next;
        }
        
        second.next=null;
        first.next = t2.next;
        
        return t1.next;
    }*/
}
