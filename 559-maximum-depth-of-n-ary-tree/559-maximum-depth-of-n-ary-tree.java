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
        if (root == null)
            return 0;

        Queue < Node > nodes = new LinkedList < > ();

        int size = 0;

        nodes.add(root);


        while (nodes.size() != 0) {

            int n = nodes.size();

            for (int i = 0; i < n; i++) {
                Node curr = nodes.poll();
                for (Node c: curr.children)
                    nodes.add(c);
            }

            size += 1;
        }


        return size;
    }


}