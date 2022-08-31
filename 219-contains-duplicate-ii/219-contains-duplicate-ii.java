class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     
        int i = 0;
        HashSet<Integer> map = new HashSet<>();
        
        while(i<nums.length)
        {
            if(i>k)
            {
              map.remove(nums[i-k-1]);  
            }
            
            //System.out.println(i + " " + map);
            
            if(map.contains(nums[i]))
                return true;
            
            map.add(nums[i]);
            
            i++;
        }
        
        return false;
    }
}