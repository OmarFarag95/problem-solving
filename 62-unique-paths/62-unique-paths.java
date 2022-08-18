class Solution {
    HashMap<String,Integer> memo = new HashMap<>();
    
    
    
    public int uniquePaths(int m, int n) {
        
        return helper(m,n,memo);
        
    }
    
    public int helper(int m, int n, HashMap<String, Integer> memo)
    {
        if(m==1 || n==1)
            return 1;
        
        if(m==0 || n==0)
            return 0;
        
        if(memo.containsKey(m+","+n))
            return memo.get(m+","+n);
        
        memo.put(m+","+n, helper(m-1,n,memo) + helper(m,n-1,memo));
        
        return memo.get(m+","+n);
    }
}