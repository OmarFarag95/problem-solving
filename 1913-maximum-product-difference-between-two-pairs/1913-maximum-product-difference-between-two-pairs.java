class Solution {
    public int maxProductDifference(int[] nums) {
        
        int big = 0;
        int bigger = 0;
        int small = Integer.MAX_VALUE;
        int smaller = Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=bigger)
            {
                big = bigger;
                bigger = nums[i];
            }
            else if (nums[i]>big)
                big = nums[i];
            
            if(nums[i]<=smaller)
            {
                small = smaller;
                smaller = nums[i];
            }
            else if (nums[i]<small)
                small = nums[i];
        }
        
        return (big*bigger) - (small*smaller);
        
    }
}