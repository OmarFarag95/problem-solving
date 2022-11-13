class Solution {
    public String reverseWords(String s) {
     
        StringBuilder sb = new StringBuilder();
        
        String [] words = s.strip().split("\\s+");;
        for(int i = words.length-1; i >=0 ;i--)
        {
            sb.append(words[i]);
            if(i!=0)
                sb.append(" ");
        }
        
        return sb.toString();
    }
}