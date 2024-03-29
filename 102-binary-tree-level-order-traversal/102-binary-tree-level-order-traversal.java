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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> output = new ArrayList<>();
        
        if (root==null)
            return output;
        
        Queue<TreeNode> q = new LinkedList();
        
        // add root node
        q.add(root);
        while(q.size()!=0)
        {
            List<Integer> level = new ArrayList<>();
            
            int size = q.size();
            
            while(size!=0)
            {
                TreeNode node = q.poll();
                level.add(node.val);
                
                if(node.left!=null)
                    q.add(node.left);
                
                if(node.right!=null)
                    q.add(node.right);
                
                size--;
            }
            
            output.add(level);
        }
        
        return output;
    }
}