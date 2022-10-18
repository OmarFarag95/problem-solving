class Solution {
    
    public void ParseChar(List<Character> t,int freq)
    {
        StringBuilder s = new StringBuilder();
          if(freq<=9)
            t.add((char) (freq+'0')); 
          else
            {
                s.append(freq);
                for(int j=0;j<s.length();j++)
                    t.add(s.charAt(j));
            }
    }
    public int compress(char[] chars) {
        
        ArrayList<Character> comp = new ArrayList<Character>();
        
        
        int c=0;
        for(int i=0;i<chars.length-1;i++)
        {
            if(chars[i]==chars[i+1])
                c+=1;
            else 
            {
                if(c>=1)
                {
                    c+=1;
                    comp.add(chars[i]);
                    ParseChar(comp,c);
                    c=0;
                }
                else  comp.add(chars[i]);
            }
        }
        
        if(c>=1)
        {
            c+=1;
            comp.add(chars[chars.length-1]);
            ParseChar(comp,c);
        }
        else comp.add(chars[chars.length-1]);
        
        int j=0;
        for(int i=0;i<comp.size();i++)
        {
            chars[j]=comp.get(i);
            j++;
        }
       
        return j;
    }
}