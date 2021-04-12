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

    public int depth(TreeNode root) {
        if (root == null)
            return 0;

        int l = depth(root.left);
        int r = depth(root.right);

        return Math.max(l, r) + 1;
    }

    public int deepestLeavesSum(TreeNode root) {

        Queue < TreeNode > q = new LinkedList < > ();

        q.add(root);

        int depth = depth(root);

        q.add(null);

        int i = 1;
        int sum = 0;

        while (!q.isEmpty()) {

            TreeNode tmp = q.poll();

            if (tmp == null) {
                if (!q.isEmpty()) {
                    q.add(null);

                    i++;
                }
            } else {
                if (tmp.left != null && i == depth - 1)
                    sum += tmp.left.val;
                else if (tmp.left != null)
                    q.add(tmp.left);

                if (tmp.right != null && i == depth - 1)
                    sum += tmp.right.val;
                else if (tmp.right != null)
                    q.add(tmp.right);

            }

        }

        return sum;

    }
}
