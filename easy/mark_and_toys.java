package easy;

import java.util.Arrays;

public class mark_and_toys {
	static int maximumToys(int[] prices, int k) {

		Arrays.sort(prices);

		int num = 0;
		int i = 0;
		while (k >= 0) {
			k -= prices[i];
			if (k > 0) {
				num++;
				i++;
			} else
				break;
		}

		return num;
	}
}
