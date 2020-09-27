package easy;

public class strong_password {

	// Complete the minimumNumber function below.
	static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		int min = 0;
		boolean count = false;
		boolean num = false;
		boolean upper = false;
		boolean lower = false;
		boolean special = false;

		String numbers = "0123456789";
		String charr = "!@#$%^&*()-+";
		for (int i = 0; i < password.length(); i++) {
			char c = password.charAt(i);
			if (Character.isUpperCase(c))
				upper = true;
			if (Character.isLowerCase(c))
				lower = true;
			if (charr.contains(c + ""))
				num = true;
			if (numbers.contains(c + ""))
				special = true;

		}
		if (!upper)
			min++;
		if (!lower)
			min++;
		if (!num)
			min++;
		if (!special)
			min++;
		if (min + password.length() < 6)
			min += 6 - (password.length() + min);

		return min;
	}
}