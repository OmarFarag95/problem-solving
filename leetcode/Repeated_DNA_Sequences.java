class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> vals = new HashSet<String>();
        HashSet<String> out = new HashSet<String>();
        
        List<String> output = new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(i+10<=s.length())
            {
                String t = s.substring(i,i+10);
            
                if(vals.contains(t) && !output.contains(t))
                    output.add(t);
                else vals.add(t);
            }
        }
        
        return output;
    }
}
