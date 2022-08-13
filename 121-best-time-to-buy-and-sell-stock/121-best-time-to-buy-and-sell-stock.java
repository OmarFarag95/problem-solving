class Solution {
    public int maxProfit(int[] prices) {
        
        PriorityQueue<Integer> prq = new PriorityQueue<>();
        
        int max_value = Integer.MIN_VALUE;
        
        for(int i=0;i<prices.length;i++)
        {
            prq.add(prices[i]);
            int value = prices[i] - prq.peek();
            
            if(value>max_value)
                max_value = value;
            
        }
        
        return max_value;
        
    }
}