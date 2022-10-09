class Solution {
//     public int[] twoSum(int[] numbers, int target) {
        
//         HashMap<Integer,Integer> map = new HashMap<>();
        
//         for(int i=0;i<numbers.length;i++)
//         {
//             if(map.containsKey(numbers[i]))
//                 return new int [] {map.get(numbers[i])+1, i+1};
            
//             map.put(target-numbers[i],i);
//         }
        
//         return new int[] {0,0};
//     }
    
    //using two pointers and O(1) space
    public int[] twoSum(int[] numbers, int target) {
         
        int l = 0;
        int r = numbers.length-1;
        
        while(l<r)
        {
            if(numbers[l] + numbers[r] == target)
                return new int [] {l+1,r+1};
            
            if(numbers[l] + numbers[r] > target)
                r--;
            else l++;
        }
        
        return new int[] {0,0};
            
    }
}