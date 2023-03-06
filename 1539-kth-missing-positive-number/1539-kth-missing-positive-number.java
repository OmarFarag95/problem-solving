class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        HashSet<Integer> map = new HashSet<>();
        
        for(int i=0;i<arr.length;i++)
            map.add(arr[i]);
        
        int i=1;
        int num=0;
        
        while(k!=0)
        {
            if(map.contains(i))
            {   
                i++;
                continue;
            }
            
            k--;
            num=i;
            i+=1;
        }
        
        return num;
    }
}