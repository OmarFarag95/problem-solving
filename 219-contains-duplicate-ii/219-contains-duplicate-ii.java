class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
     
//         int i = 0;
//         HashSet<Integer> map = new HashSet<>();
        
//         while(i<nums.length)
//         {
//             if(i>k)
//             {
//               map.remove(nums[i-k-1]);  
//             }
            
//             if(map.contains(nums[i]))
//                 return true;
            
//             map.add(nums[i]);
            
//             i++;
//         }
        
//         return false;
//     }
    
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i <nums.length;i++)
        {
            if(map.containsKey(nums[i]) && i- map.get(nums[i]) <=k )
                return true;
            
            map.put(nums[i],i);
        }
        
        return false;
    
    }
}