class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        HashMap<String, Boolean> visited = new HashMap<>();
        
        List<List<Integer>> output = new ArrayList<>();
        
        
        boolean [][] atl = new boolean[heights.length][heights[0].length];
        boolean [][] pacif = new boolean[heights.length][heights[0].length];
        
        
        for(int r=0;r<heights.length;r++)
        {
            expand(heights,r,0, heights[r][0], visited, pacif);
            expand(heights,r,heights[0].length-1, heights[r][heights[0].length-1], visited, atl);
        }
        
        for(int c=0;c<heights[0].length;c++)
        {
            expand(heights,0,c, heights[0][c], visited, pacif);
            expand(heights,heights.length-1,c, heights[heights.length-1][c], visited, atl);
        }
        
        
        for(int i=0;i<heights.length;i++)
        {
            for(int j=0;j<heights[0].length;j++)
                if(atl[i][j] && pacif[i][j])
                    output.add(Arrays.asList(i,j));
        }
        
        return output;
    }
    
    public void expand (int [][] heights, int r, int c, int current_value, HashMap<String, Boolean> visited, boolean [][] ocean)
    {
        

        
        if(r< 0  || r > heights.length-1)
            return;
        
        if(c< 0  || c > heights[0].length-1)
            return;
        
        if(heights[r][c]<current_value)
            return;
        
        if(ocean[r][c])
            return;
        
        ocean[r][c] = true;
        
        
        
        expand(heights, r-1, c, heights[r][c],visited,ocean);
        expand(heights, r+1, c, heights[r][c],visited,ocean);
        expand(heights, r, c-1, heights[r][c],visited,ocean);
        expand(heights, r, c+1, heights[r][c],visited,ocean);
        
        
        
    }
}