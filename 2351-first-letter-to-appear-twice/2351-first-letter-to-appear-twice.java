class Solution {
    public char repeatedCharacter(String s) {
        
        HashSet<Character> unique = new HashSet<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(unique.contains(s.charAt(i)))
                return s.charAt(i);
            unique.add(s.charAt(i));
        }
        
        return 'a';
    }
}