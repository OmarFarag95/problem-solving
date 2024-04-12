class Solution {
    public int findMinArrowShots(int[][] points) {
        int [][]copy = new int [points.length][2];
        HashSet<Integer>vals=new HashSet<Integer>();
        for(int i=0;i<points.length;i++)
            copy[i] = points[i].clone();
        
        int overlap = 0;
        Arrays.sort(copy, (a, b) -> a[1] - b[1]);
        
        for(int i=0;i<copy.length;i++)
        {
            boolean found=false;
            
            if(vals.contains(i))
                continue;
            
            int x1 = copy[i][0];
            int y1 = copy[i][1];
            for(int j=i;j<copy.length;j++)
            {
                int x2 = copy[j][0];
                int y2 = copy[j][1];
                
                
                if((y1<=y2 && y1>=x2) || (y2<=y1 && y2>=x1))
                {
                    found = true;
                    vals.add(j);
                                        
                    if(x1<x2)
                        x1=x2;
                    if(y1>y2)
                        y1=y2;
                    
                    
                }
            }
            if(found)
                overlap+=1;
        }
        return overlap;
    }
}