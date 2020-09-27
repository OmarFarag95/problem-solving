package easy;

public class camel_case {

	// Complete the camelcase function below.
	static int camelcase(String s) {
		int out = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(s.charAt(i))) {
				out++;
				// System.out.println(s.charAt(i));
			}
		}
		return out + 1;
	}
}