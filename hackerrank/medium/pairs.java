package hackerrank.medium;
import java.util.HashSet;

public class pairs {

	// Complete the pairs function below.
	static int pairs(int k, int[] arr) {

		int pairs = 0;

		HashSet<Integer> numbers_set = new HashSet<Integer>();

		for (int i : arr)
			numbers_set.add(i);

		for (int i = 0; i < arr.length; i++) {
			if (numbers_set.contains(arr[i] - k))
				pairs++;
		}
		return pairs;

	}
}
