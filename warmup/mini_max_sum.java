package warmup;

import java.math.BigInteger;
import java.util.Arrays;

public class mini_max_sum {
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
