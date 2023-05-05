class Solution {
    /*public int maxVowels(String s, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        while(i<s.length())
        {
            int curr = 0;
            j = i+k;
            int c = i;
            
            while(c<j && c<s.length())
            {
                if(vowels.contains(s.charAt(c)))
                    curr+=1;
                
                c+=1;
            }
            if(curr>max)
                max = curr;
            i+=1;
        }
        return max;
    }*/
    
    public int maxVowels(String s, int k) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int curr = 0;
        
        for(int i = 0;i<k;i++)
        {
            if(vowels.contains(s.charAt(i)))
                curr+=1;
        }
        
        int max = curr;
        for(int i = k;i<s.length(); i++)
        {
            // new added character in the new window
            if(vowels.contains(s.charAt(i)))
                curr+=1;
            // removed element from the sliding window
            if(vowels.contains(s.charAt(i-k)))
                curr-=1;
            
            if(curr>max)
                max = curr;
        }
        return max;
    }
}