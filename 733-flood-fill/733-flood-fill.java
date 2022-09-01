class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        boolean [][] visited = new boolean[image.length][image[0].length];
        
        dfs(image, sr, sc, color, image[sr][sc], visited);
        
        return image;
        
    }
    
    public void dfs(int [][] image, int sr, int sc, int color, int value, boolean [][] visited)
    {
        if(sr<0 || sr>=image.length)
            return;
        
        if(sc<0 || sc>=image[0].length)
            return;
        
        
        if(image[sr][sc] != value)
            return;
        
        if(visited[sr][sc])
            return;
        
        image[sr][sc] = color;
        
        
        visited[sr][sc] = true;
        
        dfs(image,sr-1,sc,color,value, visited);
        dfs(image,sr+1,sc,color,value, visited);
        dfs(image,sr,sc-1,color,value, visited);
        dfs(image,sr,sc+1,color,value, visited);
        
        
    }
}