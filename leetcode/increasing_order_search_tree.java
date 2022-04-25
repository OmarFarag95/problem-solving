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
    public TreeNode increasingBST(TreeNode root) {

        if (root == null)
            return null;

        TreeNode output = new TreeNode();

        TreeNode tmp = new TreeNode();

        tmp = output;

        List < Integer > nodes = new ArrayList < Integer > ();

        inOrderTraversal(root, nodes);


        for (int i = 0; i < nodes.size(); i++) {
            tmp.right = new TreeNode(nodes.get(i));
            tmp = tmp.right;

        }

        return output.right;

    }

    public void inOrderTraversal(TreeNode root, List < Integer > nodes) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left, nodes);
        nodes.add(root.val);
        inOrderTraversal(root.right, nodes);

    }
}
