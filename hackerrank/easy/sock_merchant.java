package hackerrank.easy;
import java.util.Arrays;

public class sock_merchant {
	static int sockMerchant(int n, int[] ar) {
		Arrays.sort(ar);
		int count = 0;
		int pairs = 0;

		for (int i = 0; i < ar.length - 1; i++) {
			if (ar[i] == ar[i + 1]) {
				count += 1;
				i = i + 1;
			}
			if (count >= 1) {
				pairs += 1;
				count = 0;
			}
		}
		return pairs;
	}

}
