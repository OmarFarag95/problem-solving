package hackerrank.medium;

public class counter_game {

	// Complete the counterGame function below.

	static boolean IsBase2(long n) {
		return ((n & (n - 1)) == 0);
	}

	static String counterGame(long n) {

		int turn = 0;
		while (n != 1) {
			if (IsBase2(n))
				n /= 2;
			else {
				double dec = Math.floor(Math.log(n) / Math.log(2.0));
				double nearset_possible = Math.pow(2, dec);
				n -= (long) nearset_possible;
			}
			System.out.println(n);
			turn++;
		}
		if (turn % 2 == 0)
			return "Richard";
		return "Louise";
	}
}
