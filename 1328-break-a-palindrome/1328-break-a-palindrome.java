class Solution {
    
//     public String breakPalindrome(String palindrome) {
        
//         if(palindrome.length()==1)
//             return "";
        
//         for(int i=0;i<palindrome.length()/2;i++)
//         {
//             if(palindrome.charAt(i)!='a')
//                 return palindrome.substring(0,i) + 'a' + palindrome.substring(i+1);
//         }
        
        
        
//         return palindrome.substring(0,palindrome.length()-1) + 'b';
        
//     }

    public String breakPalindrome(String palindrome) {
        
        char [] letters = palindrome.toCharArray();
        
        if(letters.length==1)
            return "";
        
        for(int i=0;i<letters.length/2;i++)
        {
            if(letters[i]!='a')
            {
                letters[i] = 'a';
                return String.valueOf(letters);
            }       
        }
        
        letters[letters.length-1] = 'b';
        return String.valueOf(letters);
        
    }
}