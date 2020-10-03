package leetcode.Oct20_Daily_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combination_sum {

	// first approach ---> fails in some cases
	/*
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		HashMap<Integer, Integer> nums = new HashMap<Integer, Integer>();
		for (int i = 0; i < candidates.length; i++)
			nums.put(candidates[i], i);

		List<List<Integer>> out = new ArrayList<List<Integer>>();

		for (int i = 0; i < candidates.length; i++) {
			int diff = target;

			List<Integer> t = new ArrayList<Integer>();
			if (candidates[i] == target) {
				t.add(candidates[i]);
				out.add(t);
				continue;
			}

			int sum = 0;
			while (diff > 0) {
				diff -= candidates[i];

				sum += candidates[i];
				if (diff == 0 && sum + candidates[i] == target)
					t.add(candidates[i]);

				t.add(candidates[i]);
				if (nums.containsKey(diff)) {
					t.add(diff);
					sum += diff;

					// System.out.println("---> "+diff);
					if (diff < candidates[i]) {
						diff = candidates[i];
					}
					if (sum == target) {
						Collections.sort(t);
						if (!out.contains(t)) {
							out.add(t);
							// System.out.println(t);
						}
						t = new ArrayList<Integer>();
						sum = 0;
					}
					if (sum + candidates[i] == target) {
						t.add(candidates[i]);
						Collections.sort(t);
						if (!out.contains(t)) {
							out.add(t);
							// System.out.println(t);
						}
						t = new ArrayList<Integer>();
						sum = 0;
					}
				}
				if (diff == 0 && t.size() > 1) {
					Collections.sort(t);
					if (!out.contains(t)) {
						out.add(t);
					}
					break;
				}
			}
		}
		return out;
	}*/

	// using DFS and backtracking approach ---> passes all cases
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> out = new ArrayList<List<Integer>>();
		List<Integer> t = new ArrayList<Integer>();

		combinations(candidates, out, t, target, 0);
		return out;
	}

	public void combinations(int candidates[], List<List<Integer>> out, List<Integer> t, int target, int index) {
		if (target == 0) {
			out.add(new ArrayList<Integer>(t));
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			if (candidates[i] > target)
				break;

			t.add(candidates[i]);
			combinations(candidates, out, t, target - candidates[i], i);
			t.remove(t.size() - 1);
		}
	}
}
