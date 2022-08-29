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
    public List<Integer> rightSideView(TreeNode root) {
        
        if(root==null)
            return new ArrayList<Integer>();
        
        
        Queue<TreeNode> nodes = new LinkedList<>();
        
        
        List<Integer> output = new ArrayList<>();
        
        nodes.add(root);
        //output.add(root.val);
        
        int n = 1;
        while(nodes.size()!=0)
        {
            int count = 0;
            while(n!=0)
            {
                TreeNode curr = nodes.poll();
                n--;
                
                if(n == 0)
                    output.add(curr.val);
                
                //System.out.print(curr.val + " ");
            
                if(curr.left!=null)
                {
                    nodes.add(curr.left);
                    count+=1;
                }
            
                if(curr.right!=null)
                {
                    nodes.add(curr.right);
                    count+=1;
                }
                
            }
            
            n = count;
            //System.out.println();
            
        }
        
        return output;
        
    }
}