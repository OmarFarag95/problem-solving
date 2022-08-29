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
    public boolean isValidBST(TreeNode root) {
        
      return check_bounds(root,null,null);
    }
    
    public boolean check_bounds (TreeNode root, Integer low, Integer high)
    {
        if(root==null)
            return true;
        
        if(high!=null && root.val>=high)
            return false;
        
        if(low!=null && root.val<=low)
            return false;
        
        return check_bounds(root.left,low,root.val) && check_bounds(root.right,root.val,high);
    }
}