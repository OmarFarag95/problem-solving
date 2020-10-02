package hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class closet_number {

	// Complete the closestNumbers function below.
	static int[] closestNumbers(int[] arr) {

		Arrays.sort(arr);
		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if (diff < min_diff)
				min_diff = diff;
		}
		List<Integer> pairs = new ArrayList<Integer>();
		for (int i = 0; i < arr.length - 1; i++) {
			int diff = arr[i + 1] - arr[i];
			if (diff == min_diff) {
				pairs.add(arr[i]);
				pairs.add(arr[i + 1]);
			}
		}
		int[] output = new int[pairs.size()];
		for (int i = 0; i < output.length; i++)
			output[i] = pairs.get(i);

		return output;
	}
}