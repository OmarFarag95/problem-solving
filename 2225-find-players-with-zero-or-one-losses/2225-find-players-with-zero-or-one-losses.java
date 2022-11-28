class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer,Integer> Winnersplayers = new HashMap<>();
        
        HashSet<Integer> UnWinners = new HashSet<>();
        List<Integer> non_losers = new ArrayList<>();
        List<Integer> one_losers = new ArrayList<>();
        
        for(int i = 0;i<matches.length;i++)
        {
            int [] curr = matches[i];
            
            
            UnWinners.add(curr[0]);
            Winnersplayers.put(curr[1], Winnersplayers.getOrDefault(curr[1],0)+1);
            
        }
        
        
        for(Integer k: UnWinners)
        {
            if(!Winnersplayers.containsKey(k))
                non_losers.add(k);
        }
        
        for(Integer k: Winnersplayers.keySet())
        {
            if(Winnersplayers.getOrDefault(k,0) == 1)
                one_losers.add(k);
        }
        Collections.sort(non_losers);
        Collections.sort(one_losers);
        
        List<List<Integer>> output = new ArrayList<>();
        
        output.add(non_losers);
        output.add(one_losers);
        
        return output;
    }
}
