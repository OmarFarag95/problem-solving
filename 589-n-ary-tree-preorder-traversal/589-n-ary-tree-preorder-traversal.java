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
    public List<Integer> preorder(Node root) {
        
        if (root==null)
            return new ArrayList<Integer>();
    
        Stack<Node> nodes = new Stack<>();
        
        nodes.push(root);
        
        List<Integer> output = new ArrayList<>();
        
        while(nodes.size()!=0)
        {
            Node curr = nodes.pop();
            output.add(curr.val);
            
            
            if(curr.children.size()>0)
            {
                while(curr.children.size()>0)
                {
                    nodes.push(curr.children.get(curr.children.size()-1));
                    curr.children.remove(curr.children.size()-1);
                    
                }
            }
        }
        
        return output;
    }
    
    
}