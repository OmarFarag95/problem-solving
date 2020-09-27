package medium;

import java.util.List;

public class the_coin_change_problem {
	public static long getWays(int n, List<Long> c) {
		// write your code here
		long[] iter = new long[(int) n + 1];
		iter[0] = 1;

		for (int i = 0; i < c.size(); i++) {
			for (long j = 1; j <= n; j++) {
				if (j >= c.get(i)) {
					iter[(int) j] += iter[(int) (j - c.get(i))];
				}
			}

		}

		return iter[n];

	}
}
