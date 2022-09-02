class Solution {
    public void sortColors(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        int idx = 0;
        int k=0;
        while(k<=2)
        {
            if(map.containsKey(k))
            {
                int n = map.get(k);
                while(n!=0)
                {
                    nums[idx] = k;
                    n--;
                    idx+=1;
                }
            }
            k++;
        }
    }
}