package leetcode.Oct20_Daily_Challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class kdiff_pairs_in_an_array {

	// naive approach
	/*
	public int findPairs(int[] nums, int k) {
		List<List<Integer>> temp = new ArrayList<List<Integer>>();
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] - nums[i] == k || nums[i] - nums[j] == k) {
					List<Integer> t = new ArrayList<Integer>();
					t.add(nums[j]);
					t.add(nums[i]);
					Collections.sort(t);
					if (!temp.contains(t)) {
						temp.add(t);
						c++;
					}
				}
			}
		}
		return c;
	}*/

	// Binary Search approach
	public int findPairs(int[] nums, int k) {
		Arrays.sort(nums);
		Set<Integer> vals = new HashSet<Integer>();
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			int target = k + nums[i];

			boolean found = binary_search(nums, target, i + 1, nums.length - 1);
			if (found && !vals.contains(target)) {
				c += 1;
				vals.add(target);
			}
		}
		return c;
	}

	public boolean binary_search(int arr[], int target, int l, int r) {
		int middle = (l + r) / 2;
		while (l <= r) {
			if (target == arr[middle]) {
				return true;
			} else if (target > arr[middle])
				return binary_search(arr, target, middle + 1, r);
			else
				return binary_search(arr, target, l, middle - 1);
		}
		return false;
	}
}