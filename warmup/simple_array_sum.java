package warmup;

public class simple_array_sum {
	
    static int simpleArraySum(int[] ar) 
    {
         int sum=0;
         for(int i=0;i<=ar.length-1;i++)
            sum+=ar[i];
         return sum;
    }
}
