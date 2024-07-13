class Solution {
    public double averageWaitingTime(int[][] customers) {
        
        int start = 0;
        int wait = 0;
        int end = customers[0][0];
        long sum = 0;
        
        
        for (int i = 0; i<customers.length; i++)
        {
            if(customers[i][0]>end)
                end = customers[i][0];
            
            start = end; //5 //7
            wait = customers[i][1]; //2 // 4
            end = start + wait; // 7 // 11
            
            sum += (end - customers[i][0]);// 2 // 4
            
        }
        
        return  (double)sum/(double)customers.length;
            
    }
}