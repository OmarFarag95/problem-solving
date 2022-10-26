class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        /**for(int i=0;i<nums.length;i++)
        {
            int sum = nums[i];
            
            for(int j=i+1;j<nums.length;j++)
            {
                sum+=nums[j];
                if(k!=0 && sum%k==0)
                    return true;
                else if(k==0 && sum==0)
                    return true;
            }
        }
        return false;*/
        
//         int [] pre_sum = new int [nums.length];
//         pre_sum[0] = nums[0];
        
//         for(int i=1;i<nums.length;i++)
//         {
//             pre_sum[i] = nums[i]+pre_sum[i-1];
//         }
        
//         int i=0;
        
//         int j=1;
        
//         while(j<pre_sum.length)
//         {
//             if(k!=0 && (pre_sum[j] - pre_sum[i])%k==0 && j-i+1>=2)
//                 return true;
//             else if(k==0 && (pre_sum[j] - pre_sum[i]) == 0 && j-i+1>=2)
//                 return true;
            
//             i+=1;
//             j+=1;
//         }
        
//         return false;
//     }
        
        // initialize the hash map with index 0 for sum 0
        Map<Integer, Integer> hashMap = new HashMap<>(Map.of(0, 0));
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            // if the remainder sum % k occurs for the first time
            if (!hashMap.containsKey(sum % k))
                hashMap.put(sum % k, i + 1);
            // if the subarray size is at least two
            else if (hashMap.get(sum % k) < i)
                return true;
        }
        return false;
    }
}