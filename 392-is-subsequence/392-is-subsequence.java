class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(t.length()<s.length())
            return false;
        
        for(int i = 0;i<s.length();i++)
        {
            char c = s.charAt(i);
            
            int idx  = t.indexOf(c);
            if(idx<0)
                 return false;
            
            System.out.println(idx + " "+t);
            
            t = t.substring(idx+1);
            
        }
        
        return true;
        
    }
}