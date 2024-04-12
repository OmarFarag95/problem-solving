/*class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
     
        int a = newInterval[0];
        int b = newInterval[1];
        
        ArrayList<List<Integer>> intervals_list = new ArrayList<List<Integer>>();
        
        ArrayList<Integer> vals = new ArrayList<Integer>();
        
        for(int i=0;i<intervals.length;i++)
        {
            int x = intervals[i][0];
            int y = intervals[i][1];
            
                List<Integer> values = new ArrayList<Integer>();
                values.add(x);
                values.add(y);
                intervals_list.add(values);
            
        }
        boolean f=false;
        if(a<=intervals[0][0])
        {
            if(b<=intervals[0][0])
            {
                vals.add(a);
                vals.add(b);
                System.out.println(vals);
            }
            else
            {
                for(int i=0;i<intervals.length-1;i++)
                {
                int j=i+1;
                
                while(j<intervals.length)
                {
                    if(j+1 < intervals.length && b>=intervals[j][0]&&b<=intervals[j][1])
                    {
                        System.out.println("entered");
                        vals.add(a);
                        if(b==intervals[j+1][0])
                            vals.add(intervals[j+1][0]);  
                        else vals.add(intervals[j][1]);
                        System.out.println(vals);
                        break;
                    }
                    else if(j+1 < intervals.length && b>intervals[j][1]&&b<intervals[j+1][0])
                    {
                        vals.add(a);
                        vals.add(intervals[j+1][0]);  
                        System.out.println(vals);
                        break;
                    }
                   else if (j+1 < intervals.length && b>intervals[j][0]&&b<=intervals[j][1])
                   {
                       System.out.println("entered2");
                        vals.add(a);
                        vals.add(intervals[j][1]);  
                        System.out.println(vals);
                        break;
                   }
                   else if(b>intervals[j][0] && b<=intervals[j][1])
                   {
                        vals.add(a);
                       if(b==intervals[i][1])
                            vals.add(b);
                       else vals.add(intervals[i][1]);
                        System.out.println(vals);
                        break; 
                   }
                   else if(b>=intervals[intervals.length-1][1])
                    {
                       //System.out.println("entered3");
                        vals.add(a);
                        vals.add(b);  
                        System.out.println(vals);
                        break;
                    }
                    else if(b>=intervals[intervals.length-1][0] && b<=intervals[intervals.length-1][1])
                    {
                        System.out.println("entered4");
                        vals.add(a);
                        vals.add(intervals[intervals.length-1][1]);  
                        System.out.println(vals);
                        break;
                    }
                    j++;
                }
                
                
                
                if (b>intervals[i][0] && b<=intervals[i][1])
                {
                    vals.add(a);
                    if(b==intervals[i][1])
                        vals.add(b);
                    else vals.add(intervals[i][1]);
                     System.out.println(vals);
                    break; 
                }
                    
                }
            }
        }
        if(vals.size()==0)
        {
        for(int i=0;i<intervals.length-1;i++)
        {
            if(a>=intervals[i][0] && a<=intervals[i][1])
            {
                if(b>intervals[i][1])
                {
                    int j=i+1;
                    while(j<intervals.length)
                    {
                        if(b==intervals[j][0])
                        {
                            vals.add(intervals[i][0]);
                            vals.add(intervals[j][1]);
                            System.out.println(vals);
                            break;
                        }
                        else if(b<intervals[j][0])
                        {
                            intervals[j-1][1] = b;
                            vals.add(intervals[i][0]);
                            vals.add(b);
                            System.out.println(vals);
                            break;
                        }
                        else if(b>intervals[j][0])
                        {
                            if(b<intervals[j][1])
                            {
                                vals.add(intervals[i][0]);
                                vals.add(intervals[j][1]);  
                                System.out.println(vals);
                                break;
                            }
                        }
                        
                        j++;
                    }
                    System.out.println(j);
                }
                    
            }
            else if (a>=intervals[i][1])
            {
                int j=i+1;
                
                while(j<intervals.length)
                {
                    if(j+1 < intervals.length && b>=intervals[j][0]&&b<=intervals[j][1])
                    {
                        System.out.println("enteredx");
                        if(a>intervals[j-1][0])
                            vals.add(intervals[j-1][0]);
                        else vals.add(a);
                        
                        if(b==intervals[j+1][0])
                            vals.add(intervals[j+1][0]);  
                        else vals.add(intervals[j][1]);
                        System.out.println(vals);
                        f=true;
                        break;
                    }
                    else if(j+1 < intervals.length && b>intervals[j][1]&&b<=intervals[j+1][0])
                    {
                        System.out.println("entered1");
                        vals.add(a);
                        if(b==intervals[j+1][0])
                            vals.add(intervals[j+1][0]);
                        else vals.add(b);
                        System.out.println(vals);
                         f=true;
                        break;
                    }
                   else if (j+1 < intervals.length && b>intervals[j][0]&&b<=intervals[j][1])
                   {
                       System.out.println("entered2");
                        vals.add(a);
                        vals.add(intervals[j][1]);  
                        System.out.println(vals);
                        f=true;
                        break;
                   }
                   else if(b>=intervals[intervals.length-1][1])
                    {
                       System.out.println("entered3");
                       if(a>intervals[i+1][0])
                        vals.add(intervals[i+1][0]);
                       else vals.add(a);
                        vals.add(b);  
                        System.out.println(vals);
                        break;
                    }
                    else if(b>=intervals[intervals.length-1][0] && b<=intervals[intervals.length-1][1])
                    {
                        System.out.println("entered4");
                        vals.add(a);
                        vals.add(intervals[intervals.length-1][1]);  
                        System.out.println(vals);
                         f=true;
                        break;
                    }
                    j++;
                }
               
                
                if (b<intervals[i+1][0])
                {
                    System.out.println("entered6");
                    vals.add(a);
                    vals.add(b);  
                    System.out.println(vals);
                    break;
                }
            }
        }
        }
        
        for(int i=0;i<intervals.length;i++)
        {
            int x = intervals[i][0];
            int y = intervals[i][1];
            System.out.println(x+"--->"+vals.get(0)+" | "+y+"--->"+vals.get(1));
            if(x<vals.get(0) && y < vals.get(1))
               continue;
            else if(i<intervals_list.size())
            {
                intervals_list.remove(i);
            }
        }
        System.out.println(intervals_list);
        int [][]out = new int [intervals_list.size()][2];
        
        for(int i=0;i<intervals_list.size();i++)
        {
            int x = intervals_list.get(i).get(0);
            int y = intervals_list.get(i).get(1);
            out[i][0] = x;
            out[i][1] = y;
        }
        return out;
    }
}*/

// copied solution 
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList();
        for (int[] in : intervals) {
            if (in[1] < newInterval[0]) {
                list.add(in);
            } else if (newInterval[1] < in[0]) {
                list.add(newInterval);
                newInterval = in;
            } else {
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}