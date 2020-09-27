package easy;

public class sherlock_and_squares {

	// Complete the squares function below.
	static int squares(int a, int b) {
		int out = ((int) Math.sqrt(b) - (int) Math.sqrt(a));
		if (Math.sqrt(a) % 1 != 0 && Math.sqrt(b) % 1 != 0 || (Math.sqrt(a) % 1 != 0 && Math.sqrt(b) % 1 == 0))
			return out;
		return out + 1;
	}
}
