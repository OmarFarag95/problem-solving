class Solution {
    public int balancedStringSplit(String s) {
        int cR =0;
        int cL =0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i)=='L')
                cL+=1;
            if(s.charAt(i)=='R')
                cR+=1;

            if(cL!=0 && cL==cR)
                count++;
            
        }
        return count;
    }
}
