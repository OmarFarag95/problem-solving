class Solution {
    public int findClosestNumber(int[] nums) {
        
        if(nums.length==1)
            return nums[0];
        
        Arrays.sort(nums);
        
        if(0<nums[0])
            return nums[0];
        
        if(0>nums[nums.length-1])
            return nums[nums.length-1];
        
        int index = Arrays.binarySearch(nums, 0);
        
        if(index<0)
        {
            for(int i=0;i<nums.length-1;i++)
            {
                if(0>=nums[i] && 0<=nums[i+1])
                {
                    index = i;
                    break;
                }
            }
        }
        
        
        int ldiff = Integer.MAX_VALUE;
        int rdiff = Integer.MAX_VALUE;
        
        
        if(index-1>=0)
            ldiff = Math.abs(nums[index-1]);
        
        if(index+1<nums.length)
            rdiff = Math.abs(nums[index+1]);
        
        if(Math.abs(nums[index])< ldiff && Math.abs(nums[index]) <rdiff)
            return nums[index];
        
        if(ldiff<rdiff)
            return nums[index-1];
        
        if(ldiff>rdiff)
            return nums[index+1];
        
        return Math.max(nums[index-1], nums[index+1]);
    }
}