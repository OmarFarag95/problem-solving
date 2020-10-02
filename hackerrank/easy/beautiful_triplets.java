package hackerrank.easy;
public class beautiful_triplets {

	// Complete the beautifulTriplets function below.
	static int beautifulTriplets(int d, int[] arr) {
		int c = 0;
		int triplets = 0;
		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] == d)
					c = 1;

				if (arr[j] - arr[i] == 2 * d && c == 1)
					c = 2;
			}
			if (c == 2)
				triplets++;
			c = 0;
		}
		return triplets;
	}
}
