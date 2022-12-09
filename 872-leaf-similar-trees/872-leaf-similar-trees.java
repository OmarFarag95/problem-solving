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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        if(root1==null && root2 == null)
            return true;
        if(root1==null || root2 == null)
            return false;

        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();

        parseTree(root1, t1);
        parseTree(root2, t2);

        // System.out.println(t1);
        // System.out.println(t2);

        if(t1.equals(t2))
            return true;

        return false;
        
        
    }

    public void parseTree(TreeNode root, List<Integer> t)
    {
        if(root==null)
            return;

        if(root.left == null && root.right==null)
            t.add(root.val);

        parseTree(root.left, t);
        parseTree(root.right, t);
        
    }

}