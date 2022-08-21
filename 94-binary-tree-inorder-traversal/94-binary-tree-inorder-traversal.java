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
    List<Integer> nodes = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> nodes = new ArrayList<>();
        helper(nodes,root);
        
        return nodes;
        
    }
    
    public void helper(List<Integer> nodes, TreeNode root)
    {
        if(root == null)
            return;
        
        helper(nodes, root.left);
        nodes.add(root.val);
        helper(nodes,root.right);
    }
    
}