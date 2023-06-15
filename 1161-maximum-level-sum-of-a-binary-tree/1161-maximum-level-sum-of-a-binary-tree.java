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
    public int maxLevelSum(TreeNode root) {
        
        if(root == null)
            return 0;
        
        // bfs
        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.add(root);
        
        int maxSum = root.val;
        int maxLevel = 1;
        int currLevel = 0;
        
        while(queue.size()!=0)
        {
            int levelSize = queue.size();
            int currSum = 0;
            
            if (levelSize>0)
                currLevel +=1;
            
            for(int i=0;i<levelSize;i++)
            {
                TreeNode currNode = queue.poll();
                currSum += currNode.val;
                
                if(currNode.left!=null)
                    queue.add(currNode.left);
                if(currNode.right!=null)
                    queue.add(currNode.right);
                
            }
            
            if(currSum>maxSum)
            {
                maxLevel = currLevel;
                maxSum = currSum;
            }
            
        }
        
        return maxLevel;
        
    }
}