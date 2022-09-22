class Solution {
    public String reverseWords(String s) {
        
        String [] words = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length;i++)
        {
            sb.append(reverseString(words[i].toCharArray()));
            
            if (i<words.length-1)
                sb.append(" ");
            
        }
        
        return sb.toString();
    }
    
    public String reverseString(char[] s) {
        
        int j = s.length-1;
        int i = 0;
        
        while(i<j)
        {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            j--;
            i++;
        }
        
        String ch = String.valueOf(s);
        
        return ch;
        
        
    }
}