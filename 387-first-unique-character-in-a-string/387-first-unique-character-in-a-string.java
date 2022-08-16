class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),-1);
            else
                map.put(s.charAt(i), i);
        }
        
        int min = Integer.MAX_VALUE;
        for(char c: map.keySet())
        {
            if(map.get(c)>-1 && map.get(c)<min)
                min = map.get(c);
        }
        
        if(min!=Integer.MAX_VALUE)
            return min;
        
        return -1;
        
    }
}