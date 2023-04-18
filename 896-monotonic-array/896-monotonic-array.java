class Solution {
    public boolean isMonotonic(int[] nums) {
        
        if(nums.length==1)
            return true;
        
        int sign1 = 0;
        int sign2 = 0; 
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i+1] >= nums[i])
                sign1 = 1;
            else {
                    sign1=-1;
                break;
            }
        }
        
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i+1] <= nums[i])
                sign2 = 1;
            else {
                    sign2=-1;
                break;
            }
        }
        
        return sign1==1||sign2==1;
        
    }
}