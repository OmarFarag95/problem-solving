class Solution {
    int count =0;
    public int pseudoPalindromicPaths (TreeNode root) {
        Set<Integer> nodes = new HashSet<>();
        traverse(root, nodes);
        return count;
    }
    public void traverse(TreeNode curr, Set<Integer> nodes){
        if(curr == null) 
            return;
        if(nodes.contains(curr.val))
            nodes.remove(curr.val);
        else
            nodes.add(curr.val);
        
        if(curr.left == null && curr.right==null)
            if(nodes.size()<=1) 
                count++;
        
        traverse(curr.left, new HashSet(nodes));
        traverse(curr.right, new HashSet(nodes));
    }
}