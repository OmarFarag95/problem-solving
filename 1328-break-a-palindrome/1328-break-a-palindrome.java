class Solution {
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