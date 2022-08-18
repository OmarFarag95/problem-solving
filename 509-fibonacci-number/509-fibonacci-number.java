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

// class Solution {
// //     public int fib(int n) {
      
// //         int [] fibs = new int[n+1];
        
// //         fibs[0]=0;
// //         if (n>0)
// //         {
// //         fibs[1]=1;
// //         for(int i=2;i<=n;i++)
// //             fibs[i] = fibs[i-1] + fibs[i-2];
// //         }
        
// //         return fibs[n];
// //     }
// }


// class Solution {
    
//     public int fib(int n)
//     {
        
//         if (n==0)
//             return 0;
        
        
//         int a = 0;
//         int b = 1;
        
//         int sum = 1;
        
//         int i=2;
        
//         while(i<=n)
//         {
//             sum = a+b;
//             a = b;
//             b = sum;
            
            
//             i++;
//         }
        
//         return sum;
//     }
// }

class Solution {
    HashMap<Integer,Integer> memo = new HashMap<>();
    
    public int fib(int n)
    {
        return helper_fib(n, this.memo);
    }
    
    public int helper_fib(int n, HashMap<Integer,Integer> memo)
    {
        if(n==0)
            return 0;
        
        if(n==1)
            return 1;
        
        if(memo.containsKey(n))
            return memo.get(n);
        
        memo.put(n, helper_fib(n-1,memo) + helper_fib(n-2,memo));
        
        return memo.get(n);
    }
}
