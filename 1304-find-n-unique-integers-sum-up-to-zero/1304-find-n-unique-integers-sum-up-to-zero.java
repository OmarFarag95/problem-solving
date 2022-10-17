class Solution {
    public int[] sumZero(int n) {
        
        int [] output = new int [n];
        int i = 0;
        int j = n-1;
        while(i<n/2)
        {
            output[i] = i+1;
            output[j] = -1*(i+1);
            
            i++;
            j--;
        }
        
        if(n%2!=0)
            output[n/2] = 0;
        
        return output;
    }
}