class Solution {
    public int numTeams(int[] rating) {
        
        int teams = 0;
        
        int[] minVal = new int [rating.length];
        int[] maxVal = new int [rating.length];
        
        minVal[0] = rating[0];
        maxVal[0] = rating[0];
        for(int i=1;i<rating.length;i++)
        {
            minVal[i] = Math.min(minVal[i-1],rating[i]);
            maxVal[i] = Math.max(maxVal[i-1],rating[i]);
        }
        
        for(int j=0;j<rating.length;j++)
        {
            for(int k=j+1;k<rating.length;k++)
            {
                if(rating[k] > rating[j])
                {
                    //System.out.println(rating[j]+" "+rating[k]);
                    if(j>0 && minVal[j-1]<rating[j])
                    {
                        int x = j-1;
                        while(x>=0)
                        {
                            if(rating[x]<rating[j])
                                teams+=1;
                            x--;
                        }
                    }
                    
                }
                if(rating[j] > rating[k])
                {
                    if(j>0 && maxVal[j-1]>rating[j])
                    {
                      int x = j-1;
                        while(x>=0)
                        {
                            if(rating[x]>rating[j])
                                teams+=1;
                            x--;
                        }
                    }
                }
            }
        }
    
        
        return teams;
        
    }
}