package easy;

public class minimum_distances {

	// Complete the minimumDistances function below.
	static int minimumDistances(int[] a) {
		boolean min_found = false;
		int min = Integer.MAX_VALUE;
		int distance = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					// System.out.println(a[i]+" "+a[j]+" "+i+" "+j);
					distance = j - i;
					break;
				}

			}

			System.out.println(min);
			if (distance < min & distance != 0) {
				min = distance;
				min_found = true;
			}
		}
		if (!min_found)
			return -1;
		return min;
	}
}