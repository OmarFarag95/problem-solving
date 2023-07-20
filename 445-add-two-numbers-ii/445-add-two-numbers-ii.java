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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        //solution using stack
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        while(l1!=null || l2!=null)
        {
            if(l1!=null)
            {
                s1.push(l1.val);
                l1=l1.next;
            }
            if(l2!=null)
            {
                s2.push(l2.val);
                l2=l2.next;
            }
        }
        
        int sum=0;
        int rem=0;
        int l=0;
        int r=0;
        
        ListNode curr = null;
        while(!s1.isEmpty() || !s2.isEmpty())
        {
            l=0;
            r=0;
            sum=rem;
            if(!s1.isEmpty())
                l = s1.pop();
            
            if(!s2.isEmpty())
                r = s2.pop();
            
            sum+=l+r;
            
            if(sum>9)
            {
                rem=sum/10;
                sum=sum%10;
            }
            else rem = 0;
            
            
            ListNode newNode = new ListNode(sum);
            newNode.next = curr;
            curr=newNode;
            
        }
        if(rem!=0)
        {
            ListNode newNode = new ListNode(rem);
            newNode.next = curr;
            curr=newNode; 
        }
        
        return curr;
        
    }
}