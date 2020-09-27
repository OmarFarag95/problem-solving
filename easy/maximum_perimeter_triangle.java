package easy;

import java.util.Arrays;

public class maximum_perimeter_triangle {

	// Complete the maximumPerimeterTriangle function below.
	static int[] maximumPerimeterTriangle(int[] sticks) {
		int output[] = { -1, -1, -1 };
		int n = sticks.length;
		int a = sticks.length - 1;
		int b = sticks.length - 2;
		int c = sticks.length - 3;

		if (n < 3) {
			output[0] = -1;
			return output;
		}

		Arrays.sort(sticks);

		while (c >= 0) {
			if (sticks[a] + sticks[b] > sticks[c] && sticks[b] + sticks[c] > sticks[a]
					&& sticks[a] + sticks[c] > sticks[b]) {
				output[2] = sticks[a];
				output[1] = sticks[b];
				output[0] = sticks[c];

				break;
			}
			a--;
			b--;
			c--;

		}

		return output;
	}
}