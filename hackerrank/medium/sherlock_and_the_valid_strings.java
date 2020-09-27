package medium;

import java.util.HashMap;

public class sherlock_and_the_valid_strings {

	// Complete the isValid function below.
	static String isValid(String s) {
		HashMap<Character, Integer> char_num = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (char_num.containsKey(s.charAt(i))) {
				int value = char_num.get(s.charAt(i));
				value++;
				char_num.put(s.charAt(i), value);
			} else {
				char_num.put(s.charAt(i), 1);
			}
		}

		int max = 0;
		int min = 1000000;

		for (int i = 0; i < s.length(); i++) {
			int value = char_num.get(s.charAt(i));

			if (value > max)
				max = value;
			if (value < min)
				min = value;
		}

		int min_count = 0;
		int max_count = 0;
		int distinct = 0;
		for (Character key : char_num.keySet()) {

			int value = char_num.get(key);
			if (value == min)
				min_count++;
			if (value == max)
				max_count++;

			distinct++;
		}

		if (min == max)
			return "YES";

		else if (max - 1 == min) {
			if (max_count <= 1 || min_count <= 1)
				return "YES";
		} else if (min_count == 1 && min_count == distinct - max_count)
			return "YES";
		return "NO";
	}
}
