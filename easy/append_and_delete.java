package easy;

public class append_and_delete {

	// Complete the appendAndDelete function below.
	static int longestPrefixLength(String a, String b) {
		int out = 0;
		int min = 0;
		if (a.length() <= b.length())
			min = a.length();
		else
			min = b.length();
		boolean valid = true;

		while (valid) {
			if (min != 0) {
				if (a.charAt(0) == b.charAt(0)) {
					out++;
					a = a.substring(1);

					b = b.substring(1);
					// System.out.println(a+" "+b);
					// min--;
				} else
					valid = false;
			} else
				break;
			min--;

		}
		return out;
	}

	static String appendAndDelete(String s, String t, int k) {
		int common = 0;
		int num = 0;
		if (s.length() >= t.length()) {
			common = longestPrefixLength(s, t);
			num = s.length() - common;
			num += t.length() - common;
			if (num <= k)
				return "Yes";
			else
				return "No";
		} else {
			if (t.charAt(t.length() - 1) != s.charAt(s.length() - 1))
				return "No";
			return "Yes";

		}

	}
}
