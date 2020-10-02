package hackerrank.easy;

public class alternating_characters {

	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int c = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				c++;
			}
		}

		return c;
	}
}