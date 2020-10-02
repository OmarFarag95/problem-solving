package hackerrank.easy;

import java.util.Arrays;

public class priyanka_and_toys {

	// Complete the toys function below.
	static int toys(int[] w) {

		Arrays.sort(w);
		int count = 1;
		int curr = w[0];
		for (int i = 1; i < w.length; i++) {
			if (w[i] - curr <= 4) {
				continue;
			} else {
				count++;
				curr = w[i];
			}
		}
		return count;

	}
}