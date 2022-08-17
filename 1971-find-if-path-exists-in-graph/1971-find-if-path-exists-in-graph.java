class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(source==destination)
            return true;
        
        
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        visited.add(source);
		q.add(source);
        
		while (q.size() != 0) {
			int node = q.poll();
            visited.add(node);
            if(node==destination)
                return true;
            
            HashSet<Integer> neighbours = new HashSet<>();
            
            for(int i=0;i<edges.length;i++)
            {
                if(edges[i][0]==node)
                {
                    int next = edges[i][1];
                    neighbours.add(next);
                }    
                else if(edges[i][1]==node)
                {
                    int next = edges[i][0];
                    neighbours.add(next);     
                }
            }
            
            for(int k : neighbours)
            {
                if(!visited.contains(k))
                    q.add(k);
            }
            
            
		}
        
        
        
        return false;
    }
}