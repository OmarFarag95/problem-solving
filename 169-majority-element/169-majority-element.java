class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        
        int max = -1;
        int num = -1;
        for(int k:map.keySet())
            if(map.get(k) > max)
            {
                max = map.get(k);
                num = k;
            }
        
        return num;
    }
}