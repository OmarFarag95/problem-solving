package leetcode;

public class max_profit {
	public int maxProfit(int[] prices) {
		int largest_diff = 0;
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < prices.length; i++) {
			int num1 = prices[i];
			for (int j = i + 1; j < prices.length; j++) {
				int diff = prices[j] - num1;
				if (diff > largest_diff) {
					largest_diff = diff;
					index1 = i;
					index2 = j;
				}
			}
		}
		return largest_diff;
	}
}
