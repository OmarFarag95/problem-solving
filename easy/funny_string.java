package easy;

public class funny_string {

	// Complete the funnyString function below.
	static String funnyString(String s) {
		StringBuilder word = new StringBuilder();
		word.append(s);
		word = word.reverse();
		boolean check = false;
		int orig[] = new int[s.length()];
		int rev[] = new int[s.length()];

		for (int i = 0; i < s.length() - 1; i++) {
			int a = Math.abs((int) s.charAt(i + 1) - (int) s.charAt(i));
			int b = Math.abs((int) word.charAt(i + 1) - (int) word.charAt(i));

			if (a == b)
				check = true;
			else {
				check = false;
				break;
			}

		}

		if (check)
			return "Funny";
		else
			return "Not Funny";
	}
}
