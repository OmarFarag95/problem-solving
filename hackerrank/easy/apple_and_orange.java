package easy;

public class apple_and_orange {

	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int apples_count = 0;
		int oranges_count = 0;
		for (int i = 0; i < apples.length; i++) {
			if (apples[i] + a >= s && apples[i] + a <= t)
				apples_count++;
		}
		for (int i = 0; i < oranges.length; i++) {
			if (oranges[i] + b >= s && oranges[i] + b <= t)
				oranges_count++;
		}
		System.out.println(apples_count);
		System.out.println(oranges_count);

	}

}
