package hackerrank.easy;

import java.util.HashMap;

public class caesar_cipher {

	// Complete the caesarCipher function below.
	static String caesarCipher(String s, int k) {
		k = k % 26;
		String original_alp = "abcdefghijklmnopqrstuvwxyz";
		String rotated_alp = original_alp.substring(k) + original_alp.substring(0, k);

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		String out = "";
		for (int i = 0; i < original_alp.length(); i++)
			map.put(original_alp.charAt(i), rotated_alp.charAt(i));

		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(Character.toLowerCase(s.charAt(i)))) {
				if (Character.isUpperCase(s.charAt(i))) {
					char c = map.get(Character.toLowerCase(s.charAt(i)));
					out += Character.toUpperCase(c);
				} else
					out += map.get(s.charAt(i));
			} else
				out += s.charAt(i);
		}
		return out;

	}
}
