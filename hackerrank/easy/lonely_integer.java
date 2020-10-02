package hackerrank.easy;

public class lonely_integer {

	// Complete the lonelyinteger function below.
	static int lonelyinteger(int[] a) {

		int lonely = 0;
		for (int i = 0; i < a.length; i++)
			lonely ^= a[i];

		return lonely;
	}
}
