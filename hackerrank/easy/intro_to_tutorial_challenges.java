package hackerrank.easy;

public class intro_to_tutorial_challenges {

	// Complete the introTutorial function below.
	static int introTutorial(int V, int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int mid_index = (j - i) / 2;
		int mid = arr[(j - i) / 2];
		while (j >= i) {
			if (V > mid)
				i = mid_index + 1;

			else if (V < mid)
				j = mid_index - 1;

			else
				break;

			mid_index = i + (j - i) / 2;
			mid = arr[mid_index];

		}
		return mid_index;
	}
}
