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
        if(root==null)
            return true;
        
        //for first approach
        
            ArrayList<Integer> vals = new ArrayList<>();
            create_traverse_list(root,vals);
            for(int i=0;i<vals.size()-1;i++)
                if(vals.get(i+1)<=vals.get(i))
                    return false;
        
        return true;
        
        //for second approach
        
        //return check_bounds(root,null,null);
    }
    
    public void create_traverse_list (TreeNode root,ArrayList<Integer> vals)
    {
        if(root!=null)
        {
            create_traverse_list(root.left,vals);
            vals.add(root.val);
            
            create_traverse_list(root.right,vals);
        }        
    }
}