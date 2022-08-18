class Solution {
    
    List<Integer> nums = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> output = new ArrayList<>();
        
        helper(output,nums , candidates, target, 0);
        
        
        
        
        return output;
    }
    
    public void helper(List<List<Integer>> lists, List<Integer> nums , int [] candidates, int target, int curr_index)
    {
        if(target==0)
        {
            lists.add(new ArrayList<>(nums));
            return;
        }
        
        if(target<0)
            return;
        
        for(int i=curr_index; i<candidates.length; i++)
        {
            
            nums.add(candidates[i]);
            helper(lists, nums , candidates, target-candidates[i], i);
            nums.remove(nums.size()-1);
        }
        
        
    }
    
    
}