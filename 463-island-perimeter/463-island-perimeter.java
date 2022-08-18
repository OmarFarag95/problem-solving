class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int index = 0;
        int count = 0;
        HashSet<String> visited = new HashSet<String>();
        int max_length = Integer.MIN_VALUE;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                    return DFS(grid,i,j,visited);
                
            }
            
        }
        return 0;
        
    }
    
    
    public int DFS(int [][] grid, int r, int c, HashSet<String> visited)
    {
        if(r<0 || r > grid.length-1)
            return 1;
        
        if(c<0 || c > grid[0].length-1)
            return 1;
        
        if(grid[r][c] == 0)
            return 1;
        
        StringBuilder index = new StringBuilder();
        index.append(r);
        index.append(',');
        index.append(c);
        
        String curr = index.toString();
        
        if(visited.contains(curr))
            return 0;
        
        visited.add(curr);
        
        int freq = 0;
        freq += DFS(grid, r-1, c, visited);
        freq += DFS(grid, r+1, c, visited);
        freq += DFS(grid, r, c-1, visited);
        freq += DFS(grid, r, c+1, visited);
        
        return freq;
    }
}