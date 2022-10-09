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
    public boolean findTarget(TreeNode root, int k) {
     
        HashSet<Integer> diffs = new HashSet<>();
        Queue<TreeNode> nodes = new LinkedList<>();
        
        nodes.add(root);
        
        while(nodes.size()>0)
        {
            TreeNode curr = nodes.poll();
            
            if(diffs.contains(curr.val))
                return true;
            
            diffs.add(k-curr.val);
            
            if(curr.left!=null)
                nodes.add(curr.left);
            if(curr.right!=null)
                nodes.add(curr.right);
        }
        
        return false;
    }
}