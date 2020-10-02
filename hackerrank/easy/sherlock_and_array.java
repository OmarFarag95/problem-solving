package hackerrank.easy;

import java.util.List;

public class sherlock_and_array {

	// Complete the balancedSums function below.
	static String balancedSums(List<Integer> arr) {
		int left_counter = 0;
		int right_counter = 0;
		boolean f = false;
		int j = arr.size() - 1;
		for (int i = 0; i < arr.size(); i++) {
			right_counter += arr.get(i);
		}
		for (int i = 0; i < arr.size(); i++) {

			if (i != 0)
				left_counter += arr.get(i - 1);

			right_counter -= arr.get(i);

			if (left_counter == right_counter) {
				f = true;
				break;
			}

			j = arr.size() - 1;

		}

		if (f)
			return "YES";
		return "NO";
	}
}