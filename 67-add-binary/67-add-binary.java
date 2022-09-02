class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder res =  new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        
        
        int x = 0;
        int y = 0;
        
        int rem = 0;
        while(i>=0 || j>=0)
        {
            if(i>=0)
                x = a.charAt(i) - '0';
            else x = 0;
            
            if(j>=0)
                y = b.charAt(j)- '0';
            else y = 0;
            
            int sum = x+y+rem;
            
            if(sum==2)
            {
                res.append('0');
                rem = 1;
            }
            else if(sum==3)
            {
                res.append('1');
                rem = 1;
            }
            else if (sum==1)
            {
                res.append('1');
                rem = 0;
            }
            else 
            {
                res.append('0');
                rem = 0;
            }
            
            i--;
            j--;
        }
        
        System.out.println(rem);
        if(rem==1)
            res.append(1);
        
        return res.reverse().toString();
    }
}