class Solution {
    
    public int maximumScore(int[] nums, int[] multipliers) {
        int n = nums.length;
        int m = multipliers.length;
	    int max = helper(nums, multipliers, m,n, 0, 0, new int[m][m]);
        
        return max;
    }

    private int helper(int[] nums, int[] multipliers, int m, int n, int left, int index, int[][] dp) {
	    int right = n - 1 - (index - left);
	    if (index == m) return 0;

	    if (dp[left][index] != 0) return dp[left][index];

	    int res = Math.max(
            nums[left] * multipliers[index] + helper(nums, multipliers,m,n, left+1, index+1, dp), 
            nums[right] * multipliers[index] + helper(nums, multipliers,m,n, left, index+1, dp));

        dp[left][index] = res;
	    return res;
    }
}