class Solution {
    public int percentageLetter(String s, char letter) {
        
        int count = 0;
        
        for(char c : s.toCharArray())
        {
            if(c == letter)
                count+=1;
        }
        
        double pre = ((double)count/s.length());
        
        
        return((int)(pre*100));
        
    }
}