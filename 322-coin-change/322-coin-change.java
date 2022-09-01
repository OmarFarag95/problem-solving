class Solution {
//     public int coinChange(int[] coins, int amount) {
        
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int min_count = helper(coins, amount, 0, Integer.MAX_VALUE, map);
        
//         if(min_count==Integer.MAX_VALUE)
//             return -1;
        
//         return min_count;
//     }
    
//     public int helper(int [] coins, int amount, int count, int min_count, HashMap<Integer,Integer> map)
//     {
        
//         if(amount == 0)
//             return count;
     
        
//         if(map.containsKey(amount))
//             return map.get(amount);
        
        
//         if(amount<0)
//             return Integer.MAX_VALUE;
        
//         map.put(amount,count);
        
        
//         for(int i=0;i<coins.length;i++)
//         {
//             min_count = Math.min(min_count, helper(coins, amount-coins[i], count+1, min_count, map));
//         }
        
//         //System.out.println(min_count);
        
//         return min_count;
//     }
    
        public int coinChange(int[] coins, int amount) {
        
            int [] dp = new int [amount+1];
            Arrays.fill(dp,amount+1);
            dp[0] = 0;
            for(int i = 0;i<=amount;i++)
            {
                for(int j=0;j<coins.length;j++)
                {
                    if(coins[j]<=i)
                        dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
                }
            }
            
        return (dp[amount] > amount)? -1 : dp[amount];
    }
}