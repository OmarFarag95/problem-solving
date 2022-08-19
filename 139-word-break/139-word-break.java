class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        
        HashMap<String,Boolean> memo = new HashMap<>();
        
        return helper(s, wordDict, memo);
        
    }
    
    public boolean helper(String s, List<String> wordDict, HashMap<String,Boolean> memo)
    {
        if(memo.containsKey(s))
            return memo.get(s);
        
        if(s.length()==0)
            return true;
        
        for(String w : wordDict)
        {
            if(s.indexOf(w)==0)
            {
                if(helper(s.substring(w.length()), wordDict, memo))
                {
                    memo.put(s,true);
                    return true;
                }
                else
                    memo.put(s,false);
                
            }
        }
        
        return false;
    }
    
}