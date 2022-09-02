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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> output = new ArrayList<>();
        
        Queue<TreeNode> nodes = new LinkedList<>();
        
        nodes.add(root);
        
        while(nodes.size()!=0)
        {
            int n = nodes.size();
            int i = 0;           
            double sum = 0.0;
            while(i<n)
            {
                TreeNode curr = nodes.poll();
                sum+=curr.val;
                
                i++;
                
                if(curr.left!=null)
                    nodes.add(curr.left);
                if(curr.right!=null)
                    nodes.add(curr.right);
            }
            
            output.add(sum/n);
        }
        
        return output;
    }
}