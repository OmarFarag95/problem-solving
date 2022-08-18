class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        
        
        helper(output, nums, n, k, 1);
        
        System.out.println(output);
        
        return output;
    }
    
    public void helper(List<List<Integer>> output, List<Integer> nums, int n, int k, int index)
    {
        if(k==0)
        {
            output.add(new ArrayList<>(nums));
            return;
        }
        
        for(int i = index; i<=n;i++)
        {
            
            nums.add(i);
            helper(output, nums, n, k-1, i+1);
            nums.remove(nums.size()-1);
        }
    }
}