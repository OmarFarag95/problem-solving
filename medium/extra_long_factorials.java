package medium;

import java.math.BigInteger;

public class extra_long_factorials {

	// Complete the extraLongFactorials function below.
	static void extraLongFactorials(int n) {
		BigInteger out = BigInteger.ONE;
		for (int i = n; i > 1; i--)
			out = out.multiply(BigInteger.valueOf(i));
		System.out.println(out);
	}
}
