package hackerrank.easy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class two_characters {

	// Complete the alternate function below.

	static boolean isValid(String s) {
		for (int i = 1; i < s.length(); i++)
			if (s.charAt(i) == s.charAt(i - 1))
				return false;
		return true;
	}

	static String remove_chars(String S, char c1, char c2) {
		String output = "";
		char[] chars = S.toCharArray();

		for (char c : chars) {
			if (c == c1 || c == c2)
				output += c;
		}
		return output;
	}

	static int alternate(String s) {

		HashSet<Character> chars = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (!chars.contains(s.charAt(i)))
				chars.add(s.charAt(i));
		}

		List<Character> unique_chars = new ArrayList<Character>(chars);
		int max = 0;
		for (int i = 0; i < unique_chars.size(); i++) {
			char c1 = unique_chars.get(i);
			for (int j = i + 1; j < unique_chars.size(); j++) {
				char c2 = unique_chars.get(j);

				String t = remove_chars(s, c1, c2);
				if (isValid(t)) {
					int length = t.length();
					if (length > max)
						max = length;
				}

			}
		}
		return max;
	}
}
