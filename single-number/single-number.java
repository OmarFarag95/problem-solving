class Solution {
    /*public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> freqs = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            freqs.put(nums[i],freqs.getOrDefault(nums[i],0)+1);
        }
        
        for (int k:freqs.keySet())
        {
            if(freqs.get(k)==1)
                return k;
        }
        
        return -1;
        
    }
    */
    
    public int singleNumber(int[] nums) {
        int num = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            num ^= nums[i];
        }
        
        return num;
    }
}