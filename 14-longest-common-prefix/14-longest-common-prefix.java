class Solution {
   /* public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        
        if(strs.length==0)
            return prefix;
       
        Arrays.sort(strs, (a, b)->Integer.compare(a.length(), b.length()));
        
        int max = strs[0].length();
        
        String ref=strs[0];
        
        int c=0;
        for(int i=1;i<strs.length;i++)
        {
            
            String curr=strs[i];
            
            for(int j=0;j<max;j++)
            {
                if(ref.charAt(j)==curr.charAt(j))
                {
                    c++;
                }
                else 
                {
                break;
                }
            }
            
            if(c<max)
                max=c;
            
            c=0;
            
            
            if(max==0)
                break;
    }
        //max-=1;
        prefix=strs[0].substring(0,max);
        return prefix;
}*/
        
 public String longestCommonPrefix(String[] strs)
    {
     if(strs.length==1)
         return strs[0];
     if(strs.length==0)
         return "";
     
        int index=0;
        int min = Integer.MAX_VALUE;
        int j=0;
        for(int i=1;i<strs.length;i++)
        {
            index=0;
            j=0;
            while(j<strs[i].length() && j<strs[i-1].length())
            {
                if(strs[i].charAt(j)==strs[i-1].charAt(j))
                    index+=1;
                else break;
                j++;
            }
            min = Math.min(min,j);
        }
        //System.out.println(min);
        
        return strs[0].substring(0,min);
    }
}