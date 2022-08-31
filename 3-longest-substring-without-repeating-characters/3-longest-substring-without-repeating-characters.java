class Solution {
//     public int lengthOfLongestSubstring(String s) {
        
//         int max_length = 0;
        
//         for(int i=0;i<s.length();i++)
//         {
//             HashSet<Character> candidate = new HashSet<>();
            
//             for(int j=i;j<s.length();j++)
//             {
//                 if(candidate.contains(s.charAt(j)))
//                     break;
                
//                 candidate.add(s.charAt(j));
//             }
            
//             if(candidate.size()>max_length)
//                 max_length = candidate.size();
            
//         }
        
//         return max_length;
//     }
    
    public int lengthOfLongestSubstring(String s) {
        
        int max_length = 0;
        int i = 0;
        int j = 0;
        
        HashSet<Character> candidate = new HashSet<>();
        
        while(j<s.length())
        {
            if(candidate.contains(s.charAt(j)))
            {
                i++;
                j=i;
                candidate.clear();
            }
            else
            {
                candidate.add(s.charAt(j));
                max_length = Math.max(max_length, candidate.size());
                j++;
                
            }
        }
        
        return max_length;
    }
    
    
}