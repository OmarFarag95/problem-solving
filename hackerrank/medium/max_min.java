package hackerrank.medium;

import java.util.Arrays;

public class max_min {

	// Complete the maxMin function below.
	static int maxMin(int k, int[] arr) {
		int output = 0;
		Arrays.sort(arr);

		int i = 0;
		int j = k - 1;
		int min = Integer.MAX_VALUE;
		while (j < arr.length) {
			if (arr[j] - arr[i] < min)
				min = arr[j] - arr[i];
			i += 1;
			j += 1;
		}

		return min;
	}
}
