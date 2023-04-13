class Solution {
    /*public String removeStars(String s) {
        
        int stars = 0;
        List<List<Integer>> ranges = new ArrayList<>();
        
        int start = -1;
        int i = 0;
        while(i<s.length())
        {
            if(s.charAt(i) == '*')
            {
                start = i;
                i+=1;
                while(i<s.length() && s.charAt(i)=='*')
                    i++;
                
                List<Integer> curr = new ArrayList<>();
                curr.add(start);
                curr.add(i-1);
                
                ranges.add(curr);
            }
            i++;
        }
        
        System.out.println(ranges);
        
        char chars [] = s.toCharArray();
        
        int latest = 0;
        
        int length = 0;
        for(int j = 0;j<ranges.size();j++)
        {
            int st = ranges.get(j).get(0);
            int end = ranges.get(j).get(1);
            
            st-=length;
            end-=length;
            
            s = s.substring(0,st-(end-st+1)) + s.substring(end+1);
            
            length = 2*(end-st+1);
        }
        return s;
    }*/
    /*public String removeStars(String s) {

        Stack < Character > st = new Stack < Character > ();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*')
                st.pop();
             else 
                 st.push(s.charAt(i));
            
        }

        for (char c: st)
            sb.append(c);

        return sb.toString();

    }*/
    public String removeStars(String s)
    {
        int i = 0;
        int j = 0;
        
        char chars [] = new char[s.length()];
        
        while(i<s.length())
        {
            if(s.charAt(i) == '*')
            {
                j--;
            }
            else
            {
                chars[j] = s.charAt(i);
                j++;
            }
            i++;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(i=0;i<j;i++)
        {   
            sb.append(chars[i]);
        }
        
        return sb.toString();
    }
}