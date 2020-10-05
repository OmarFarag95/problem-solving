package leetcode.Oct20_Daily_Challenge;

public class remove_covered_intervals {
	public int removeCoveredIntervals(int[][] intervals) {
		int c = 0;
		int[][] copy = new int[intervals.length][2];
		for (int i = 0; i < intervals.length; i++)
			copy[i] = intervals[i].clone();

		for (int i = 0; i < copy.length; i++) {
			int start = copy[i][0];
			int end = copy[i][1];

			for (int j = 0; j < intervals.length; j++) {
				int start_ref = intervals[j][0];
				int end_ref = intervals[j][1];

				if (j == i)
					continue;

				if (start >= start_ref && end <= end_ref) {
					c++;
					break;
				}
			}
		}

		return intervals.length - c;
	}

}
