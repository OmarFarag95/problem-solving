class Solution {
    public int minSetSize(int[] arr) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        
        int [] sorted_freq = new int [map.size()];
        
        int j=0;
        for(int k:map.keySet())
        {
            sorted_freq[j]=map.get(k);
            j++;
        }
        
        Arrays.sort(sorted_freq);
        
        int thres = arr.length/2;
        
        int count = 0;
        
        
        
        for(int i=sorted_freq.length-1; i>=0 ;i--)
        {
            thres-=sorted_freq[i];
            count+=1;
            
            if(thres<=0)
                break;
            
        }
        
        return count;
    }
}