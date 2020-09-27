package easy;

public class repeated_string {

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {
		int size = s.length();

		long c = 0;
		for (int i = 0; i < size; i++) {
			if (s.charAt(i) == 'a')
				c++;
		}

		long rep = n / size;
		c = c * rep;
		if (n % size != 0) {
			long x = n % size;
			for (int i = 0; i < x; i++) {
				if (s.charAt(i) == 'a')
					c++;
			}
		}
		// System.out.println(s);

		return c;
	}
}