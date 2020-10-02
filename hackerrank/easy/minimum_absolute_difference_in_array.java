package hackerrank.easy;

import java.util.Arrays;

public class minimum_absolute_difference_in_array {

	// Complete the minimumAbsoluteDifference function below.
	static int minimumAbsoluteDifference(int[] arr) {

		Arrays.sort(arr);
		int diff = Math.abs(arr[0] - arr[1]);
		for (int i = 1; i < arr.length - 1; i++) {
			if (Math.abs(arr[i + 1] - arr[i]) < diff)
				diff = Math.abs(arr[i + 1] - arr[i]);
		}
		return diff;

	}
}