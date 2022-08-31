class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        
        
        int min_length = Integer.MAX_VALUE;
        
        if(nums.length>0 && nums[0] >= target)
            min_length = 1;
        
        
        int [] prefix_sum = new int [nums.length];
        
        prefix_sum[0] = nums[0];
        
        for(int i=1;i<prefix_sum.length;i++)
            prefix_sum[i] = prefix_sum[i-1] + nums[i];
        
    
        int i = 0;
        int j = 1;
        
        
        while(i<prefix_sum.length)
        {
            
            if(j<=prefix_sum.length-1 && prefix_sum[j]>=target)
                min_length = Math.min(min_length, j+1);
            
            if(j<=prefix_sum.length-1 && prefix_sum[j] - prefix_sum[i] >= target)
            {
                min_length = Math.min(min_length, j-i);
                i++;
            }

            else if(j<=prefix_sum.length-1 && prefix_sum[j]-prefix_sum[i] < target)
                j++;

            else i++;
            
        }
        
        
        if(min_length == Integer.MAX_VALUE)
            return 0;
        
        return min_length;
    }
}