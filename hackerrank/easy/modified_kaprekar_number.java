package hackerrank.easy;

public class modified_kaprekar_number {
	static boolean checkIfKaprekar(int n) {
		String sq = "" + ((long) n * n);
		int d = ("" + n).length();
		int len2 = sq.length();
		int l, r = 0;
		if (sq.length() >= 2) {
			r = Integer.parseInt(sq.substring(len2 - d));
			l = Integer.parseInt(sq.substring(0, sq.length() / 2));

		} else if (n == 1)
			return true;

		else
			return false;

		if (r + l == n)
			return true;
		return false;
	}

	// Complete the kaprekarNumbers function below.
	static void kaprekarNumbers(int p, int q) {
		String out = "";
		while (p <= q) {
			if (checkIfKaprekar(p))
				out += p + " ";
			p++;
		}

		if (out.length() == 0)
			System.out.println("INVALID RANGE");
		else
			System.out.println(out);
	}
}