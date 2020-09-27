package medium;

public class candies {

	// Complete the candies function below.
	static long candies(int n, int[] arr) {

		int[] vals = new int[arr.length];
		for (int i = 0; i < vals.length; i++)
			vals[i] = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1])
				vals[i] = vals[i - 1] + 1;

		}

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i - 1] > arr[i]) {
				int sum = vals[i] + 1;
				if (sum > vals[i - 1])
					vals[i - 1] = vals[i] + 1;
			}

		}

		long sum = 0;
		for (int i = 0; i < vals.length; i++)
			sum += vals[i];

		return sum;
	}
}