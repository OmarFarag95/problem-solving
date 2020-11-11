package leetcode.Oct20_Daily_Challenge;

public class binary_search {
	public int search(int[] nums, int target) {

		int n = bs(nums, target, 0, nums.length - 1);
		return n;

	}

	public int bs(int[] nums, int target, int l, int r) {

		while (l <= r) {
			int middle = (l + r) / 2;

			if (target == nums[middle])
				return middle;

			if (target > nums[middle])
				return bs(nums, target, middle + 1, r);

			else
				return bs(nums, target, l, middle - 1);

		}
		return -1;
	}
}