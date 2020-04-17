package warmup;

public class plus_minus {

	static void plusMinus(int[] arr) {
		double pos = 0;
		int pos_c = 0;
		double neg = 0;
		int neg_c = 0;
		double zeros = 0;
		int zeros_c = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0)
				pos_c += 1;
			else if (arr[i] < 0)
				neg_c += 1;
			else
				zeros_c += 1;
		}
		pos = (double) pos_c / arr.length;
		neg = (double) neg_c / arr.length;
		zeros = (double) zeros_c / arr.length;

		System.out.println(pos);
		System.out.println(neg);
		System.out.println(zeros);

	}

}
