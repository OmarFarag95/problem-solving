package easy;
import java.io.*;
import java.util.*;

public class Maximizing_XOR {

    // Complete the maximizingXor function below.
    static int maximizingXor(int l, int r) 	
    {
    	
      int  max=0;
        for(int i=l;i<r;i++)
        {
            for(int j=l;j<=r;j++)
            {
                int val=i^j;
                    if(val>max)
                        max=val;
            }
        }
      return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int l = scanner.nextInt();

        int r = scanner.nextInt();

        int result = maximizingXor(l, r);
        
        System.out.println(result);
    }
}