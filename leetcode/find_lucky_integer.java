package leetcode;

import java.util.Arrays;

public class find_lucky_integer {
	public int findLucky(int[] arr) {
		Arrays.sort(arr);

		int count = 0;
		int max = 0;
		int lucky = -1;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == arr[i - 1])
				count++;
			else {
				count += 1;
				if (count > max && arr[i - 1] > lucky && arr[i - 1] == count) {
					max = count;
					lucky = arr[i - 1];
				}
				count = 0;
			}
		}

		count += 1;
		if (count > max && arr[arr.length - 1] > lucky && arr[arr.length - 1] == count) {
			max = count;
			lucky = arr[arr.length - 1];
		}

		return lucky;

	}
}
