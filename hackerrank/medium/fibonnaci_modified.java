package hackerrank.medium;

import java.math.BigInteger;

public class fibonnaci_modified {

	// Complete the fibonacciModified function below.
	static BigInteger fibonacciModified(int t1, int t2, int n) {
		BigInteger[] fib = new BigInteger[n];
		fib[0] = BigInteger.valueOf(t1);
		fib[1] = BigInteger.valueOf(t2);

		for (int i = 2; i <= fib.length - 1; i++) {
			fib[i] = fib[i - 2].add(fib[i - 1].multiply(fib[i - 1]));
			// System.out.println(fib[i-2]+" "+fib[i-1]+" "+fib[i]);
		}
		return fib[fib.length - 1];
	}
}
