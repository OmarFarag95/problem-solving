package easy;

import java.util.HashMap;

public class permuting_two_arrays {

	// Complete the twoArrays function below.
	static String twoArrays(int k, int[] A, int[] B) {
		boolean valid = true;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			int diff = k - A[i];
			if (map.containsKey(diff)) {
				int val = map.get(diff);
				val += 1;
				map.put(diff, val);
			} else {
				map.put(diff, 1);
			}
		}

		for (int key : map.keySet()) {
			int count = 0;
			int required = map.get(key);

			for (int i = 0; i < B.length; i++) {
				if (B[i] >= key)
					count++;
			}
			if (count < required)
				valid = false;
		}

		if (!valid)
			return "NO";

		return "YES";

	}
}
