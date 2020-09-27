package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sequential_digits {
	public List<Integer> sequentialDigits(int low, int high) {
		List<Integer> nums = new ArrayList<Integer>();

		// int length = (int)(Math.log10(low)+1);
		// int den = (int)Math.pow(10,length-1);
		// int a=low%den;
		int d = 1;
		int orig = d;
		int num = d;
		while (orig <= 9) {
			d += 1;
			num = num * 10 + d;

			if (num <= high && d < 10) {
				if (num >= low)
					nums.add(num);
			} else {
				d = orig + 1;
				num = d;
				orig += 1;
			}
		}
		Collections.sort(nums);
		return nums;
	}

	public boolean fact_number(int num) {
		int a = num % 10;
		num /= 10;
		while (num != 0) {
			int b = num % 10;
			num /= 10;
			if (a - b == 1)
				a = b;
			else
				return false;

		}
		return true;
	}

}
