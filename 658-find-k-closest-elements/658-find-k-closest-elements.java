class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> output = new ArrayList<>();
        
        if(x<arr[0])
        {
            for(int i=0;i<arr.length;i++)
            {
                if(k!=0)
                    output.add(arr[i]);
                else break;
                k--;
            }
        }
        
        else if(x>arr[arr.length-1])
        {
            for(int i=arr.length-k;i<arr.length;i++)
            {
                if(k!=0)
                    output.add(arr[i]);
                else break;
                k--;
            }
        }
        
        else 
        {
            int index = Arrays.binarySearch(arr, x);
            
            if (index <0)
            {
                for(int i=0;i<arr.length-1;i++)
                {
                    if(x>=arr[i] && x<=arr[i+1])
                    {
                        index = i;
                        break;
                    }
                }
            }
            
            int l = index;
            int r = index+1;
            
            
            while(k!=0)
            {
                int ldiff = Integer.MAX_VALUE;
                int rdiff = Integer.MAX_VALUE;
                
                if(l>=0)
                    ldiff = Math.abs(arr[l]-x);
                
                if (r<=arr.length-1)
                    rdiff = Math.abs(arr[r]-x);
                
                if(ldiff<rdiff)
                {
                    output.add(arr[l]);
                    l--;
                }
                else if(ldiff>rdiff)
                {
                    output.add(arr[r]);
                    r++;
                }
                else
                {
                    if(arr[l]<x)
                    {
                        output.add(arr[l]);
                        l--;
                    }
                    else
                    {
                        output.add(arr[r]);
                        r++;
                    }
                }
                
                k--;
                
            }
        }
        
        Collections.sort(output);
        
        return output;
        
    }
}