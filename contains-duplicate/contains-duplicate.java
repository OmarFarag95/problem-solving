class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> unique = new HashSet<>();
        
        for(int i:nums)
        {
            if(unique.contains(i))
                return true;
            unique.add(i);
        }
    
    return false;
    }
}

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//         Arrays.sort(nums);
        
//         for(int i=1;i<nums.length;i++)
//             if(nums[i]==nums[i-1])
//                 return true;
    
//     return false;
//     }
// }
