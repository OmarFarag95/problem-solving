package hackerrank.easy;

public class breaking_records {
	static int[] breakingRecords(int[] scores) {
		int[] out = new int[2];
		int max = scores[0];
		int min = scores[0];
		String low_i = "";
		String high_i = "";
		String maximum = "" + max + " ";

		int high = 0;
		int low = 0;
		for (int i = 1; i < scores.length; i++) {
			if (scores[i] > max) {
				high++;
				max = scores[i];
				high_i += i + " ";
				maximum += max + " ";
			}
			if (scores[i] == max)
				maximum += max + " ";
			if (scores[i] < min) {
				min = scores[i];
				low++;
				low_i += i + " ";
			}

		}
		out[0] = high;
		out[1] = low;
		return out;

	}
}
