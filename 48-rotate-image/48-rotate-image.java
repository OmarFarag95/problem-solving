class Solution {
//     public void rotate(int[][] matrix) {
       
//         int [][] temp = new int [matrix.length][matrix.length];
        
//         int c = matrix.length-1;
//         int r = 0;
        
//         for(int i=0; i<matrix.length;i++)
//         {
//             for(int j = 0;j<matrix.length;j++)
//             {
//                 temp[r][c] = matrix[i][j];
//                 r++;
//             }
//             c--;
//             r = 0;
//         }
        
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix.length;j++)
//                 matrix[i][j] = temp[i][j];
//         }
//     }
    
    public void rotate(int [][] matrix)
    {
        
        // transpose matrix first (i,j) --> (j,i)
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i;j<matrix.length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // reverse columns
        int c_start = 0;
        int c_end = matrix.length-1;
        
        while(c_start<=c_end)
        {
            for(int i=0;i<matrix.length;i++)
            {
                int temp = matrix[i][c_start];
                matrix[i][c_start] = matrix[i][c_end];
                matrix[i][c_end] = temp;
            }
            c_start+=1;
            c_end-=1;
        }
    }
}