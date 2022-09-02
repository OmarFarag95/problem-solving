class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        
        List<Integer> output = new ArrayList<>();
        int i = num.length-1;
        
        int rem = 0;
        int x = 0;
        int y = 0;
        
        while(i>=0 || k>0)
        {
            // get digit from k
            
            if(k>0)
            {
                x = k%10;
                k/=10;
            }
            else x = 0;
            
            if(i>=0)
                y = num[i];
            else y =0;
            
            int sum = x+y+rem;
            
            output.add(sum%10);
            
            rem = sum/10;
            
            i--;
            
        }
        
        if(rem!=0)
            output.add(rem);
        
        Collections.reverse(output);
        
        return output;
    }
}