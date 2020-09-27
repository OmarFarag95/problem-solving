package easy;

import java.util.Arrays;

public class find_the_median {

	// Complete the findMedian function below.
	static int findMedian(int[] arr) {
		Arrays.sort(arr);

		if (arr.length % 2 != 0)
			return arr[arr.length / 2];
		else
			return (arr[arr.length / 2] + arr[(arr.length / 2) - 1]) / 2;

	}
}