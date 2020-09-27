package easy;

public class beautiful_binary_string {

	// Complete the beautifulBinaryString function below.
	static int beautifulBinaryString(String b) {
		int c = 0;
		for (int i = 0; i < b.length() - 2; i++) {
			if (b.charAt(i) == '0' && b.charAt(i + 1) == '1' && b.charAt(i + 2) == '0') {
				c++;
				i = i + 2;
			}
		}

		return c;
	}
}