package hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class icecream_parlor {
	// Complete the missingNumbers function below.
	static int[] missingNumbers(int[] arr, int[] brr) {

		HashMap<Integer, Integer> arrayA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> arrayB = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arrayA.containsKey(arr[i]))
				arrayA.put(arr[i], arrayA.get(arr[i]) + 1);
			else
				arrayA.put(arr[i], 1);

		}

		for (int i = 0; i < brr.length; i++) {
			if (arrayB.containsKey(brr[i]))
				arrayB.put(brr[i], arrayB.get(brr[i]) + 1);
			else
				arrayB.put(brr[i], 1);
		}
		ArrayList<Integer> missing = new ArrayList<Integer>();

		for (int i : arrayB.keySet()) {
			if (arrayA.containsKey(i) && arrayA.get(i).equals(arrayB.get(i)))
				continue;
			else
				missing.add(i);
		}

		int[] output = missing.stream().mapToInt(i -> i).toArray();
		Arrays.sort(output);

		return output;

	}
}
