class Solution {
    public int findMin(int[] nums) {
        
        int l = 0;
        int r = nums.length-1;
        
        if(nums[l]<=nums[r])
            return nums[0];
        
        int min = Integer.MAX_VALUE;
        while(l<r)
        {
            int mid = l + (r-l)/2;
            
            min = nums[mid];
            
            if(nums[mid]>nums[mid+1])
                return nums[mid+1];
            else if(nums[mid]<nums[mid-1])
                return nums[mid];
            
            if(nums[mid]>nums[0])
            {
                l = mid+1;
            }
            else
            {
                r= mid-1;
            }
        }
        
        return min;
        
    }
}