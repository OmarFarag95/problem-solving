class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length+1;
        
        int sum = (len*(0+len-1))/2;
        int actual = 0;
        for(int i=0;i<nums.length;i++)
            actual+=nums[i];
        
        return sum-actual;
    }
}