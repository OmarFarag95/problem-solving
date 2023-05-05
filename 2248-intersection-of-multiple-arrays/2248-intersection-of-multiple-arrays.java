class Solution {
    public List<Integer> intersection(int[][] nums) {
        
        HashMap<Integer,Integer> num_vs_count = new HashMap<>();
        
        for(int i =0;i<nums.length;i++)
        {
            for(int j = 0;j<nums[i].length;j++)
            {
                num_vs_count.put(nums[i][j],num_vs_count.getOrDefault(nums[i][j],0)+1);
            }
        }
        
        List<Integer> intersection = new ArrayList<>();
        
        for(int k: num_vs_count.keySet())
        {
            if(num_vs_count.get(k) == nums.length)
                intersection.add(k);
        }
        
        Collections.sort(intersection);
        
        return intersection;
    }
}