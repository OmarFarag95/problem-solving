class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        
        HashSet<List<Integer>> output = new HashSet<>();
        HashMap<Integer,List<Integer>> memo = new HashMap<>();
        
        List<Integer> curr = new ArrayList<>();
        
        helper(output, curr, candidates, target, 0);
        
        
        return new ArrayList<>(output);
        
        
        
    }
    
    public void helper(HashSet<List<Integer>> output, List<Integer> curr, int [] candidates, int target, int index)
    {    
            
        if(target==0)
        {
            List<Integer> new_list = new ArrayList<>(curr);
            
            
            output.add(new_list);
            
            return;
        }
        
        if(target<0)
            return;
        
        for(int i=index; i<candidates.length; i++)
        {
            if(candidates[i]>target)
                continue;
            
            if (i > index && candidates[i] == candidates[i-1]) continue;
            
            curr.add(candidates[i]);
            helper(output, curr, candidates, target-candidates[i], i+1);
            curr.remove(curr.size()-1);
        }
    }
    
}