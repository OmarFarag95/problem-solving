class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ind_val = new HashMap<Integer,Integer>();
        int [] out = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int diff = target-nums[i];
            
            if(ind_val.containsKey(diff))
            {
                out[0]=ind_val.get(diff);
                out[1]=i;
                return out;
            }
            else ind_val.put(nums[i],i);
        }
        return out;
}
}