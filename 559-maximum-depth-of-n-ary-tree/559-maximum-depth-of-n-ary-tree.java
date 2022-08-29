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
    public int maxDepth(Node root) {
        if(root==null)
            return 0;
    
        Queue<Node> nodes = new LinkedList<>();
        
        int size = 0;
        
        
        nodes.add(root);
        
        int n = 1;
        
        int count = 0;
        while(nodes.size()!=0){
            
            count = 0;
            
            
            //System.out.println(n);
            
            while(n!=0)
            {
                Node curr = nodes.poll();
                if(curr.children.size()>0)
                    for(Node c: curr.children)
                    {
                        nodes.add(c);
                        count+=1;
                    }
                n--;
            }
            
            size+=1;
            
            n = count;
            
        }
        return size;
    }
    
    
}