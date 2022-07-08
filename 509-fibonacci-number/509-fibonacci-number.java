// recursive solution
// class Solution {
//     public int fib(int n) {
        
//         if(n==0)
//             return 0;
//         if(n==1)
//             return 1;
        
//         return fib(n-1) + fib(n-2);
        
//     }
// }

// optimized solution

class Solution {
    public int fib(int n) {
      
        int [] fibs = new int[n+1];
        
        fibs[0]=0;
        if (n>0)
        {
        fibs[1]=1;
        for(int i=2;i<=n;i++)
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        
        return fibs[n];
    }
}
