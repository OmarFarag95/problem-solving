class Solution {
    public String countAndSay(int n) {
        
        if(n==1)
            return "1";
        
        return Parse(countAndSay(n-1));
    }

    
    public String Parse(String s)
    {
        StringBuilder out = new StringBuilder();
        s+='#';
        int c=1;
        char st= s.charAt(0);
        int i=1;
        
        while(i<s.length())
        {
            if(s.charAt(i)==st)
                c++;
            
            else
            {
                out.append(c);
                out.append(st);
                st=s.charAt(i);
                c=1;
            }
            i++;
        }
        return out.toString();
    }
}

