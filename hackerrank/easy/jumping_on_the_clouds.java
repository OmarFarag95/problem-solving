package hackerrank.easy;

public class jumping_on_the_clouds {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {

		int count = 0;
		for (int i = 0; i < c.length - 1; i++) {
			if (i + 2 < c.length && c[i + 2] == 0) {
				System.out.println(i + "  " + (i + 2));
				count++;
				i += 1;
			} else {
				count++;
				System.out.println(i);
			}
		}

		return count;
	}
}