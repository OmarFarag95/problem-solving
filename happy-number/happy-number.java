class Solution {
    public boolean isHappy(int n) {
        
        int v = 0;
        
        HashSet<Integer> cache = new HashSet<>();
        
        while(v!=1)
        {   
            v = 0;
            
            while(n!=0)
            {
                int curr= n%10;
                n/=10;
                v+=curr*curr;
            }
            
            if (cache.contains(v))
                return false;
            
            cache.add(v);
            n = v;
        }
        
        return true;
    }
}