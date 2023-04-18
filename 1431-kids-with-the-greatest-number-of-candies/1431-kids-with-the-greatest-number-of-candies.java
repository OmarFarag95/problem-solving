class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int maxsofar = 0;
        
        List<Boolean> output = new ArrayList<>();
        
        for(int i = 0;i<candies.length;i++)
        {
            if(candies[i]>maxsofar)
                maxsofar = candies[i];
        }    
        
        for(int i = 0;i<candies.length;i++)
        {
            if(candies[i] + extraCandies>=maxsofar)
                output.add(true);
            else output.add(false);
        }
        return output;
    }
}