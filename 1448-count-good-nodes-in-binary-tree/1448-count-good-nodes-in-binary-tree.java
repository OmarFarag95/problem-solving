/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        
        Stack<TreeNode> nodes = new Stack<>();
        
        HashMap<TreeNode,Integer> map = new HashMap<>();
        
        nodes.push(root);
        map.put(root, Integer.MIN_VALUE);
        
        int count = 0;
        
        
        while(nodes.size()!=0)
        {
            int n = nodes.size();
            
            TreeNode curr = nodes.pop();
                int curr_max = map.get(curr);
                
                if(curr.val >= curr_max)
                {
                    count+=1;
                    curr_max = curr.val;
                }
                
                if(curr.left!=null)
                {
                    nodes.push(curr.left);
                    map.put(curr.left,curr_max);
                }
                
                if(curr.right!=null)
                {
                    nodes.push(curr.right);
                    map.put(curr.right,curr_max);
                }
                
                
            }
        
        
        
        return count;
    }
}