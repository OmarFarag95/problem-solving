package hackerrank.easy;

import java.util.ArrayList;

public class game_of_thrones_I {

	// Complete the gameOfThrones function below.
	static String gameOfThrones(String s) {
		int count = 0;
		boolean f = true;
		ArrayList<Character> list = new ArrayList<Character>();
		if (s.length() % 2 == 0) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (!(list.contains(c))) {
					list.add(c);
					count++;
					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(j) == c)
							count++;
					}
					if (count % 2 != 0) {
						f = false;
						break;
					}
					count = 0;
				}
			}
		} else {
			int odd = 0;
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (!(list.contains(c))) {
					list.add(c);
					count++;
					for (int j = i + 1; j < s.length(); j++) {
						if (s.charAt(j) == c)
							count++;
					}
					if (count % 2 != 0 && odd > 1) {
						f = false;
						break;
					} else if (count % 2 != 0)
						odd++;

					count = 0;
				}
			}
		}
		if (f)
			return "YES";
		else
			return "NO";

	}
}