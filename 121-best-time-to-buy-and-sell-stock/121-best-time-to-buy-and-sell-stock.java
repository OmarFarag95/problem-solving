// class Solution {
//     public int maxProfit(int[] prices) {
        
//         PriorityQueue<Integer> prq = new PriorityQueue<>();
        
//         int max_value = Integer.MIN_VALUE;
        
//         for(int i=0;i<prices.length;i++)
//         {
//             prq.add(prices[i]);
//             int value = prices[i] - prq.peek();
            
//             if(value>max_value)
//                 max_value = value;
            
//         }
        
//         return max_value;
        
//     }
// }

class Solution {
     public int maxProfit(int[] prices) {
        
        
         int max_value = Integer.MIN_VALUE;
         int min_value = Integer.MAX_VALUE;
        
         for(int i=0;i<prices.length;i++)
         {
             if(prices[i]<min_value)
                 min_value = prices[i];
             
             int profit = prices[i] - min_value;
            
             if(profit>max_value)
                 max_value = profit;
            
         }
        
         return max_value;
        
     }
 }