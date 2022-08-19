class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
                
        int m = matrix.length;
        int n = matrix[0].length;
        
        int left_col = 0;
        int right_col = n-1;
        
        int top_row = 0;
        int bottom_row = m-1;
        
        List<Integer> output = new ArrayList<>();
        
        while(top_row<=bottom_row && left_col<=right_col)
        {
            //right direction --> fix i, increase j
            int i = top_row;
            int j = left_col;
            
            for(; j<=right_col; j++)
                output.add(matrix[i][j]);
            
            top_row+=1;
            
            //down direction --> fix j, increase i;
            i = top_row;
            j = right_col;
            for(; i<=bottom_row;i++)
                output.add(matrix[i][j]);
            
            right_col-=1;
            
            //left direction --> fix i, decrement j
            if(bottom_row>=top_row)
            {
                i = bottom_row;
                j = right_col;
                for(; j>=left_col; j--)
                    output.add(matrix[i][j]);
            }
            
            bottom_row-=1;
            
            //up direction --> fix j, decrement i
            if(right_col>=left_col)
            {
                i = bottom_row;
                j = left_col;
                for(; i>=top_row;i--)
                    output.add(matrix[i][j]);
            }
            
            left_col+=1;
            
            
        }
        
        return output;
        
    }
}