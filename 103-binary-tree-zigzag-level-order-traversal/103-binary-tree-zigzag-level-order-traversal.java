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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        
        List<List<Integer>> output = new ArrayList<>();
        
        if (root==null)
            return output;
        
        Queue<TreeNode> nodes = new LinkedList<>();
        
        
        nodes.add(root);
        
        int entries = 1;
        
        int direction = 1; //odd --> right to left, even left to right
        
        while(nodes.size()!=0)
        {
            List<Integer> out = new ArrayList<>();
            
            while(entries!=0)
            {
                TreeNode curr = nodes.poll();
                out.add(curr.val);
                entries--;
                
                if(curr.left!=null)
                    nodes.add(curr.left);
                
                if(curr.right!=null)
                    nodes.add(curr.right);
            }
            
            if(direction%2==0)
                Collections.reverse(out);
            
            output.add(out);
            
            direction+=1;
            entries = nodes.size();
            
            
        }
        
        return output;
    }
}