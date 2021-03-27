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
    //traverse binary tree in PostOrder
    
    void BT_traverse(TreeNode root, List<Integer> elements) 
    { 
        if (root == null) 
            return; 
  
        BT_traverse(root.left,elements); 
  
        BT_traverse(root.right,elements); 
   
        elements.add(root.val); 
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> elem_A = new ArrayList<Integer>();
        List<Integer> elem_B = new ArrayList<Integer>();
        
        BT_traverse(root1, elem_A);
        BT_traverse(root2, elem_B);
        
        for(int i=0;i<elem_B.size();i++)
            elem_A.add(elem_B.get(i));
        
        Collections.sort(elem_A);
        
        return elem_A;
        
    }
}
