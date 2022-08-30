class Solution {
    public void rotate(int[][] matrix) {
       
        int [][] temp = new int [matrix.length][matrix.length];
        
        int c = matrix.length-1;
        int r = 0;
        
        for(int i=0; i<matrix.length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                temp[r][c] = matrix[i][j];
                r++;
            }
            c--;
            r = 0;
        }
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix.length;j++)
                matrix[i][j] = temp[i][j];
        }
    }
}