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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)
            return result;
        
        
        PostOrderHelper(root, result);
        return result;
    }
    
    public static void  PostOrderHelper(TreeNode root,  List<Integer> result)
    {
        if(root == null)
            return;
        PostOrderHelper(root.left, result);
        PostOrderHelper(root.right, result);
        
        result.add(root.val);
    }

}