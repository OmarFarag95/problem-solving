package hackerrank.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class maximum_subarray_sum {

	// Complete the maximumSum function below.

	static long maximumSum(long[] a, long m) {

		long[] sum = new long[a.length];
		long[] sum_mod = new long[a.length];
		sum[0] = a[0];

		for (int i = 1; i < a.length; i++) {
			sum[i] = sum[i - 1] + a[i];
		}
		for (int i = 0; i < sum.length; i++) {
			sum_mod[i] = sum[i] % m;
		}

		HashMap<Long, List<Integer>> val_ind = new HashMap<Long, List<Integer>>();

		for (int i = 0; i < sum_mod.length; i++) {
			if (val_ind.containsKey(sum_mod[i])) {
				List<Integer> t = val_ind.get(sum_mod[i]);
				t.add(i);
				val_ind.put(sum_mod[i], t);
			} else {
				List<Integer> t = new ArrayList<Integer>();
				t.add(i);
				val_ind.put(sum_mod[i], t);
			}
		}

		Arrays.sort(sum_mod);

		List<Integer> indices = new ArrayList<Integer>();

		List<Long> vals = new ArrayList<Long>(val_ind.keySet());

		Collections.sort(vals);

		for (long i : vals) {
			List<Integer> t = val_ind.get(i);
			indices.addAll(t);
		}
		long min = Long.MAX_VALUE;

		for (int i = 0; i < sum_mod.length - 1; i++) {
			if (indices.get(i) > indices.get(i + 1))
				if (sum_mod[i + 1] - sum_mod[i] < min)
					min = sum_mod[i + 1] - sum_mod[i];
		}

		// System.out.println(min);
		if (sum_mod[sum_mod.length - 1] > m - min)
			return sum_mod[sum_mod.length - 1];

		return m - min;
	}
}