package easy;

public class super_reduced_string {

	// Complete the superReducedString function below.
	static String superReducedString(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			int index = i + 1;
			if (s.charAt(i) == s.charAt(index)) {
				s = s.substring(0, i) + s.substring(index + 1);
				i = -1;
			}
		}
		// System.out.println(s);
		if (s.length() == 0)
			return "Empty String";
		return s;

	}
}