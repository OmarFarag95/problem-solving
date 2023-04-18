class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        for(int i = 0;i<nums.length;i++)
            sum+=nums[i];
        
        int sumsofar = 0;
        for(int i = 0;i<nums.length;i++)
        {
            
            if(sumsofar == sum-sumsofar-nums[i]) //nums[i] because of the strictyly condition
                return i;
            
            sumsofar+=nums[i];
        }
        
        return -1;
    }
}