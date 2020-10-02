package hackerrank.easy;

public class anagram {

	// Complete the anagram function below.
	static int anagram(String s) {
		String first = "";
		String second = "";

		if (s.length() % 2 != 0)
			return -1;
		else {
			first = s.substring(0, (s.length() / 2));
			second = s.substring((s.length() / 2), s.length());
		}
		System.out.println(first + " " + second);

		int count = 0;

		for (int i = 0; i < first.length(); i++) {
			for (int j = 0; j < second.length(); j++) {
				if (first.charAt(i) == second.charAt(j)) {
					count++;
					// System.out.println(first.charAt(i)+" "+second.charAt(j));
					second = second.substring(0, j) + second.substring(j + 1);
					// System.out.println(second);
					break;
				}
			}
		}
		int out = first.length() - count;

		return out;

	}
}