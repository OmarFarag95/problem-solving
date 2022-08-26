class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<>();
        
        List<Integer> curr = new ArrayList<>();
        
        HashSet<List<Integer>> map = new HashSet<>();
        
        helper(output, nums, curr, nums.length, 0, map);
        
        return output;
        
    }
    
    void helper(List<List<Integer>> output, int [] nums, List<Integer> curr, int count, int index, HashSet<List<Integer>> map)
    {
        if(count==0)
        {
            
            output.add(new ArrayList<>(curr));
            
            map.add(new ArrayList<>(curr));
            
            return;
        }
        
        for(int i=0; i<nums.length;i++)
        {
            if(curr.contains(nums[i]))
                continue;
            
            curr.add(nums[i]);
            helper(output, nums, curr, count-1, i+1, map);
            curr.remove(curr.size()-1);
        }
        
    }
}