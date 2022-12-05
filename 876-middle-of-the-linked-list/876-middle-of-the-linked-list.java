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
    public ListNode middleNode(ListNode head) {
        
        int size = size(head);
        
        if(size==2)
            return head.next;
        
        if(head.next==null)
            return head;
        
        int target = size/2;

        
        int i=0;
        
        ListNode t = head;
        while(t.next!=null)
        {
            if (i==target)
                return t;
            i+=1;
            t=t.next;
        }
        
        return head;
    }
    
    public int size(ListNode head)
    {
        ListNode t = head;
        int size = 1;
        while(t.next!=null)
        {
            size+=1;
            t=t.next;
        }
        
        return size;
    }
}