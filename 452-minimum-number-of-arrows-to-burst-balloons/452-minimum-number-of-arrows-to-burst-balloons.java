class Solution {
    public int findMinArrowShots(int[][] points) {
        
        HashSet<Integer>vals=new HashSet<Integer>();
     
        int overlap = 0;
     
        Arrays.sort(points, (a, b) -> a[1] - b[1]);
        
        for(int i=0;i<points.length;i++)
        {
            boolean found=false;
            
            if(vals.contains(i))
                continue;
            
            int x1 = points[i][0];
            int y1 = points[i][1];
            
            for(int j=i;j<points.length;j++)
            {
                int x2 = points[j][0];
                int y2 = points[j][1];
                
                if(y1<=y2 && y1>=x2)
                {
                    found = true;
                    vals.add(j);
                }
            }
            if(found)
                overlap+=1;
        }
        return overlap;
    }
}