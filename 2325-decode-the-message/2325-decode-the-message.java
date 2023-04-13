class Solution {
    public String decodeMessage(String key, String message) {
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        HashMap<Character,Character> char_to_idx = new HashMap<>();
        
        key = key.replaceAll("\\s", "");
        
        int j = 0;
        for(int i=0;i<key.length();i++)
        {
            if(char_to_idx.containsKey(key.charAt(i)))
                continue;
            char_to_idx.put(key.charAt(i),alphabet.charAt(j));
            j++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<message.length();i++)
        {
            
            char c = message.charAt(i);
            
            if(c==' ')
            {
                sb.append(" ");
                continue;
            }
            
            sb.append(char_to_idx.get(c));
        }
        return sb.toString();
    }
}