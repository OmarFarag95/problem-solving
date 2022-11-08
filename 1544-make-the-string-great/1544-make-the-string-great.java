class Solution {
    public String makeGood(String s) {
        
        StringBuilder output = new StringBuilder();
        
        Stack<Character> chars = new Stack<>();
        
        for (char currChar : s.toCharArray()) {
            
            if (!chars.isEmpty())
            {
                //NICE TRICK
                if(Math.abs(chars.lastElement()-currChar)==32)
                    chars.pop();
                
            else
                chars.add(currChar);
            }
            else chars.add(currChar);
        }
        
        for (char currChar : chars) 
            output.append(currChar);
        return output.toString();
    }
}