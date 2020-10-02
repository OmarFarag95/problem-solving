package hackerrank.medium;

import java.util.HashMap;

public class bigger_is_greater {

	// Complete the biggerIsGreater function below.
	static String biggerIsGreater(String w) {

		HashMap<Character, Integer> char_int = new HashMap<Character, Integer>();

		char[] alpha = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
				't', 'u', 'v', 'w', 'x', 'y', 'z' };

		char ch[] = w.toCharArray();

		for (int i = 0; i < alpha.length; i++)
			char_int.put(alpha[i], i + 1);

		boolean impossible = true;
		for (int i = 0; i < w.length() - 1; i++) {
			if (!(char_int.get(w.charAt(i)) >= char_int.get(w.charAt(i + 1)))) {
				impossible = false;
				break;
			}
		}

		if (impossible)
			return "no answer";

		// in case value is not already the greatest;
		int index = 0;
		for (int i = ch.length - 1; i > 0; i--) {
			if (char_int.get(ch[i]) > char_int.get(ch[i - 1])) {
				index = i;
				break;
			}
		}

		char pivot = ch[index - 1];
		System.out.println(index);
		int index_max = 0;
		for (int i = ch.length - 1; i >= index; i--) {
			if (char_int.get(ch[i]) > char_int.get(pivot)) {
				index_max = i;
				break;
			}
		}

		char temp = ch[index_max];
		ch[index_max] = ch[index - 1];
		ch[index - 1] = temp;

		int j = ch.length - 1;
		// reverse sequence
		for (int i = index; i < j; i++) {
			char t = ch[j];
			ch[j] = ch[i];
			ch[i] = t;
			j--;
		}

		String out = "";
		for (int i = 0; i < ch.length; i++)
			out += ch[i];

		return out;
	}
}