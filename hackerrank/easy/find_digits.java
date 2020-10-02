package hackerrank.easy;

public class find_digits {

	// Complete the findDigits function below.
	static int findDigits(int n) {
		int temp = n;
		int c = 0;
		while (n != 0) {
			int a = n % 10;
			if (a != 0 && temp % a == 0)
				c++;
			n /= 10;
		}

		return c;

	}
}
