class Solution {
//     public int minOperations(int[] nums, int x) {
        
//         int min_count = Integer.MAX_VALUE;
        
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int v = size(nums, 0, nums.length-1, 0, min_count, x, map);
        
        
        
//         return (v != Integer.MAX_VALUE) ? v: -1;
//     }
    
//     public int size(int [] nums, int start, int end, int count, int min_count, int x, HashMap<Integer,Integer> map)
//     {
//         if(map.containsKey(x))
//             return map.get(x);
        
//         if(x==0)
//             return count;
        
//         if(x<0)
//             return Integer.MAX_VALUE;
        
        
//         map.put(x, min_count);
        
//         if(start<=nums.length-1 && end>=0 && start<=end)
//         {
        
//             int l = size(nums, start+1, end, count+1, min_count, x - nums[start], map);

//             int r = size(nums, start, end-1, count+1, min_count, x - nums[end], map);

//             min_count = Math.min(l,r);
//         }
        
        
//         return min_count;
//     }
    
    public int minOperations(int[] nums, int x) {
        
        int sum = 0;
        for(int n:nums)
            sum += n;
        
        int target = sum - x;
        
        if(target<0)
            return -1;
        
        
        int [] presum = new int[nums.length];
        presum[0] = nums[0];
        
        for(int i = 1; i<presum.length; i++)
            presum[i] = presum[i-1] + nums[i];
        
        int l = 0;
        int r = 0;
        
        int max_length = Integer.MIN_VALUE;
        
        while(l<presum.length)
        {
            if(r<presum.length && presum[r]==target)
                max_length = Math.max(max_length, r+1);
            
            if(r<presum.length && presum[r] - presum[l] == target)
            {
                max_length = Math.max(max_length, r-l);
                l++;
            }
            
            else if(r<presum.length && presum[r] - presum[l] < target)
                r++;
            
            else l++;
            
        }
        
        
        return (max_length != Integer.MIN_VALUE)? nums.length - max_length : -1;
    }
}