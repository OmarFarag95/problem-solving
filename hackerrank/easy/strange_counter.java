package easy;

public class strange_counter {

	// Complete the strangeCounter function below.
	static long strangeCounter(long t) {
		long start = 1;
		long end = 3;
		long value = 3;

		// find ranges
		while (!(t >= start && t <= end)) {
			start = (start * 2) + 2;
			end = (end * 2) + 3;
			value = value * 2;
		}
		value = value - (t - start);

		return value;

	}
}
