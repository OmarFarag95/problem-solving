class Solution {
    public int maxSubArray(int[] nums) {

        int[] pre_sum = new int[nums.length];

        pre_sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++)
            pre_sum[i] = nums[i] + pre_sum[i - 1];


        int max = Integer.MIN_VALUE;
        int min = 0;

        for (int i = 0; i < pre_sum.length; i++) {
            max = Math.max(max, pre_sum[i] - min);
            min = Math.min(min, pre_sum[i]);
        }

        return max;
    }
}
