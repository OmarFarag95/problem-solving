class Solution {
    public int strStr(String haystack, String needle) {
        
        int i = 0;
        while(haystack.length()>0)
        {
            if(haystack.indexOf(needle) == 0)
                return i;
            
            haystack = haystack.substring(1);
            i+=1;
        }
        
        return -1;
    }
}