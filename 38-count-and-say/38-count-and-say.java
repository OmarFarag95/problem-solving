class Solution {
    public String countAndSay(int n) {
        
        if(n==1)
            return "1";
        
        return Parse(countAndSay(n-1));
    }

    
    public String Parse(String s)
    {
        s+='#';
        int c=1;
        String out="";
        char st= s.charAt(0);
        int i=1;
        
        while(i<s.length())
        {
            if(s.charAt(i)==st)
                c++;
            
            else
            {
                out+=""+c+""+st;
                st=s.charAt(i);
                c=1;
            }
            i++;
        }
        return out;
    }
}

