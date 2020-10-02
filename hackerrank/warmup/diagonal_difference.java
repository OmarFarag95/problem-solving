package hackerrank.warmup;

public class diagonal_difference {
	static int diagonalDifference(int[][] arr) {
		int prim = 0;
		int sec = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j)
					prim += arr[i][j];
				if (i + j == arr[i].length - 1)
					sec += arr[i][j];
			}
		}
		return Math.abs(prim - sec);
	}

}
