class Solution {
    public int kthFactor(int n, int k) {
        
        int root = (int)(Math.sqrt(n));
        
        List<Integer> factors = new ArrayList<>();
        
        for(int i=1;i<=root;i++)
        {
            if(n%i==0)
            {
                if(!factors.contains(i))
                factors.add(i);
                
                int div = n/i;
                
                if(!factors.contains(div))
                    factors.add(div);
                
                
            }
            
        }
        Collections.sort(factors);
        if(k<=factors.size())
            return factors.get(k-1);
        return -1;
    }
}
