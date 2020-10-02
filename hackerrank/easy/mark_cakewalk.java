package hackerrank.easy;

import java.util.Arrays;

public class mark_cakewalk {

	// Complete the marcsCakewalk function below.
	static long distance(int index, int calorie) {
		return (long) (Math.pow(2, index) * calorie);
	}

	static long marcsCakewalk(int[] calorie) {

		Arrays.sort(calorie);

		long miles = 0;
		int j = 0;
		for (int i = calorie.length - 1; i >= 0; i--) {
			miles += distance(j, calorie[i]);
			j++;
		}

		return miles;

	}
}