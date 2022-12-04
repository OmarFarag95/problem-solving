class Solution {
    public int minimumAverageDifference(int[] nums) {
     
        long [] preSum = new long[nums.length+1];
        long [] suffSum = new long[nums.length+1];
        
        int i = 0;
        int j = nums.length-1;
        
      for (int index = 0; index < nums.length; ++index) {
            preSum[index + 1] = preSum[index] + nums[index];
        }
        
        for (int index = nums.length - 1; index >= 0; --index) {
            suffSum[index] = suffSum[index + 1] + nums[index];
        }
        
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(i = 0;i<nums.length; ++i)
        {
            long left = preSum[i+1];
            long leftAvg = left/(i+1);
            
            long right = suffSum[i+1];
            long rightAvg = right;
            
            if(nums.length-i-1!=0)
                rightAvg = right/(nums.length-i-1);
            
            int currDiff = (int) Math.abs(leftAvg-rightAvg);
            
            if (currDiff < min) {
                min = currDiff;
                idx = i;
            }
        }
        
        return idx;
    }
}