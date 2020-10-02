package hackerrank.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class sherlock_and_anagrams {

	// Complete the sherlockAndAnagrams function below.

	static boolean anagram(String s1, String s2) {
		char s1_chars[] = s1.toCharArray();
		char s2_chars[] = s2.toCharArray();
		Arrays.sort(s1_chars);
		Arrays.sort(s2_chars);

		for (int i = 0; i < s1_chars.length; i++) {
			if (s1_chars[i] != s2_chars[i])
				return false;
		}
		return true;
	}

	static int sherlockAndAnagrams(String s) {

		HashMap<Integer, List<String>> len_vals = new HashMap<Integer, List<String>>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String t = s.substring(i, j + 1);
				int len = t.length();
				if (len_vals.containsKey(len)) {
					List<String> vals = len_vals.get(len);
					vals.add(t);
					len_vals.put(len, vals);
				} else {
					List<String> vals = new ArrayList<String>();
					vals.add(t);
					len_vals.put(len, vals);
				}
			}
		}

		int out = 0;
		for (int len : len_vals.keySet()) {
			List<String> vals = len_vals.get(len);
			for (int i = 0; i < vals.size(); i++)
				for (int j = i + 1; j < vals.size(); j++)
					if (anagram(vals.get(i), vals.get(j)))
						out++;

		}
		return out;

	}
}
