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
    //using extra space
    public ListNode deleteDuplicates(ListNode head) {
        TreeMap<Integer,Integer> tree_map = new TreeMap<Integer, Integer>();
        
        ListNode l = head;
        
        while(l!=null)
        {
            int v = l.val;
            tree_map.put(v,tree_map.getOrDefault(v,0)+1);
            l=l.next;
        }
        
        ListNode t = new ListNode(0);
        ListNode output = t;
        for(int i:tree_map.keySet())
        {
           if(tree_map.get(i)>1)
               continue;
            t.next = new ListNode(i);
            t=t.next;
        }
        return output.next;
    }
}