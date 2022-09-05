/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        
        List<List<Integer>> output = new ArrayList<>();
        
        if(root==null)
            return output;
        
        Queue<Node> nodes = new LinkedList();
        nodes.add(root);
        
        
        while(nodes.size()!=0)
        {
            int n = nodes.size();
            List<Integer> level = new ArrayList<>();
            while(n!=0)
            {
                Node curr = nodes.poll();
                
                level.add(curr.val);
                
                for(Node c : curr.children)
                    nodes.add(c);
                
                n--;
            }
            if(level.size()>0)
                output.add(level);
        }
        
        return output;
    }
}