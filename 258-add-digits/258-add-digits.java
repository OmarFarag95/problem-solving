class Solution {

    // recursive solution
    public int addDigits(int num) {
        
        if(num%10==num)
            return num;
        
        int val =0;
        while(num!=0)
        {
            int a = num%10;
            num=num/10;
            val+=a;
        }
        
        return addDigits(val);
        
    }
    
   /* public int addDigits(int num) {
        
        int val = 0;
        if(num<10)
            return num;
        
        while(num%10!=num)
        {
           val=0;
            while(num!=0)
            {
                int a = num%10;
                num=num/10;
                val+=a;
            }
            num=val;
        }
        
        return val;
        
    }*/
}