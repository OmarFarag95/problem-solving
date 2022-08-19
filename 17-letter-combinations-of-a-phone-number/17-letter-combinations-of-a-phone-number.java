class Solution {
    
            HashMap<Character,List<Character>> map = new HashMap<>(){{
            put('2', Arrays.asList('a','b','c'));
            put('3', Arrays.asList('d','e','f'));
            put('4', Arrays.asList('g','h','i'));
            put('5', Arrays.asList('j','k','l'));
            put('6', Arrays.asList('m','n','o'));
            put('7', Arrays.asList('p','q','r','s'));
            put('8', Arrays.asList('t','u','v'));
            put('9', Arrays.asList('w','x','y','z'));
            
        }};
    
    public List<String> letterCombinations(String digits) {
    
        if(digits.length()==0)
            return new ArrayList<String>();
        
        List<String> output = new ArrayList<>();
        
        StringBuilder curr = new StringBuilder();
        
        helper(output, curr, digits.length(), digits, 0);
        
        System.out.println(output);
        
            
        return output;
        
    }
    
    public void helper(List<String> output, StringBuilder curr, int n, String digits, int index)
        
    {
        if(n==0)
        {
            output.add(curr.toString());
            return;
        }
        
        for(int i=index;i<digits.length();i++)
        {
            List<Character> numbs = map.get(digits.charAt(i));
            
            for(int j = 0; j<numbs.size() ; j++)
            {
                curr.append(numbs.get(j));
                helper(output, curr, n-1, digits, i+1);
                curr.deleteCharAt(curr.length()-1);
            }
        }
    }
}