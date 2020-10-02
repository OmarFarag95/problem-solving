package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;
import java.math.BigInteger;

public class min_max_sum {

	// Complete the miniMaxSum function below.
	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		BigInteger min = BigInteger.valueOf(0);
		BigInteger max = BigInteger.valueOf(0);
		for (int i = 0; i < arr.length - 1; i++)
			min = min.add(BigInteger.valueOf(arr[i]));
		for (int i = arr.length - 1; i > 0; i--)
			max = max.add(BigInteger.valueOf(arr[i]));

		System.out.println(min + " " + max);

	}
}