package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RecentCounter {
	int counter = 0;
	int index = 0;
	int curr_index;
	HashMap<Integer, List<Integer>> k_val = new HashMap<Integer, List<Integer>>();

	public RecentCounter() {
		counter = 0;
		curr_index = 0;
	}

	public int ping(int t) {
		counter = 0;
		int st = t - 3000;
		int end = t;
		int i = curr_index;
		while (i < index) {
			List<Integer> range = k_val.get(i);
			if (st >= range.get(0) && st <= range.get(1))
				counter += 1;
			else {
				curr_index = i + 1;
			}
			i++;
		}
		ArrayList<Integer> range = new ArrayList<Integer>();
		range.add(st);
		range.add(end);
		k_val.put(index, range);
		index += 1;
		return counter + 1;
	}
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter(); int param_1 = obj.ping(t);
 */