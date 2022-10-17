class Solution {
    public boolean checkIfPangram(String sentence) {
        
        HashSet<Character> alphapet = new HashSet<>();
        
        for(int i=0;i<sentence.length();i++)
        {
            alphapet.add(sentence.charAt(i));
        }
        
        if(alphapet.size()==26)
            return true;
        
        return false;
    }
}