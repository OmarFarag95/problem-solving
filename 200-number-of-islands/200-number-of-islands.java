class Solution {
    public int numIslands(char[][] grid) {
        
        int index = 0;
        int count = 0;
        HashSet<String> visited = new HashSet<String>();
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(DFS(grid,i,j,visited))
                    count+=1;
                
            }
            
        }
        
        return count;
        
    }
    
    
    public boolean DFS(char [][] grid, int r, int c, HashSet<String> visited)
    {
        if(r<0 || r > grid.length-1)
            return false;
        
        if(c<0 || c > grid[0].length-1)
            return false;
        
        if(grid[r][c] == '0')
            return false;
        
        String index = r+","+c;
        
        if(visited.contains(index))
            return false;
        
        visited.add(index);
        
        DFS(grid, r-1, c, visited);
        DFS(grid, r+1, c, visited);
        DFS(grid, r, c-1, visited);
        DFS(grid, r, c+1, visited);
        
        return true;
        
    }
}