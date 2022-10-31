class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[i].length;j++)
            {
                
                    if(map.containsKey(j-i))
                    {
                        if(map.get(j-i) != matrix[i][j])
                            return false;
                    }
                    else
                    {
                        map.put(j-i, matrix[i][j]);
                    }
                
            }
        }
        return true;
    }
}