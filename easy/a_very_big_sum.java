package easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class a_very_big_sum {

	// Complete the aVeryBigSum function below.
	static long aVeryBigSum(long[] ar) {
		long sum=0;
        for(int i=0;i<ar.length;i++)
            sum+=ar[i];
            return sum;
    }
}