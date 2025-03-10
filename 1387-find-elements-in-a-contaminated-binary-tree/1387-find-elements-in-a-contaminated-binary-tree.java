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
class FindElements {

    HashSet<Integer> nums;
    public FindElements(TreeNode root) {
        nums = new HashSet<>();
        dfs(root,0);
    }
    
    public boolean find(int target) {
        return nums.contains(target);
    }

    public void dfs(TreeNode currentNode, int currentValue)
    {
        if(currentNode == null)
            return;
        
        nums.add(currentValue);
        dfs(currentNode.left, currentValue*2 + 1);
        dfs(currentNode.right, currentValue*2 + 2);
        
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */