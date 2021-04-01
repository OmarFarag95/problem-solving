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
    
      //first solution uses extra space
    /*public boolean isPalindrome(ListNode head) {
        
        int s= size(head);
        
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();
        
        
        int i=0;
        
        while(i<s/2)
        {
            i++;
            s1.add(head.val);
            head=head.next;
        }
        
       if(s%2!=0)
           head=head.next;
        
        while(head!=null)
        {
            s2.add(head.val);
            head = head.next;
        }
        
        int j=s2.size()-1;
        
        for(int k=0;k<s1.size();k++)
        {
            
            if((int)s1.get(k)==(int)s2.get(j))
            {
                j--;
                continue;
            }
            else return false;
        }
        
        return true;
    }
    
    public int size(ListNode head)
    {
        ListNode n = head;
        int s=0;
        while(n!=null)
        {
            s+=1;
            n=n.next;
        }
        return s;
    }*/
    
    
    public boolean isPalindrome(ListNode head) {
        
        if(head==null)
            return true;
        ListNode rev = new ListNode(head.val);
        ListNode n = head;
        
        while(n.next!=null)
        {
            ListNode new_node = new ListNode(n.next.val);
            new_node.next = rev;
            rev = new_node;
            
            n=n.next;
        }
        
        while(head!=null)
        {
            if(head.val!=rev.val)
                return false;
            head=head.next;
            rev = rev.next;
        }
        return true;
    }
}
