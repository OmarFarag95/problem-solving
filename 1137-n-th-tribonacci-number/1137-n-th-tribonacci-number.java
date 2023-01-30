class Solution {
//     public int tribonacci(int n) {
        
//         if(n==0)
//             return 0;
//         if(n==1 || n==2)
//             return 1;
        
//         int [] fib = new int[n+1];
//         fib[0] = 0;
//         fib[1] = 1;
//         fib[2] = 1;
        
//         for(int i=3;i<=n;i++)
//         {
//             fib[i] = fib[i-1] + fib[i-2] + fib[i-3]; 
//         }
        
//         return fib[n];
        
//     }
    public int tribonacci(int n) {
        
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 1;
        if(n==0)
            return 0;
        if(n==1 || n==2)
            return 1;
        
       
        int i = 2;
        while(i<n)
        {
            d = a+b+c;
            a = b;
            b = c;
            c = d;
            i++;
            
        }
        
        return c;
        
    }
}