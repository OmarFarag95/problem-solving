package hackerrank.easy;

public class electronic_shop {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int max = 0;
		int pay = 0;
		int kb = 0;
		boolean poss = false;
		for (int i = 0; i < keyboards.length; i++) {
			kb = keyboards[i];
			pay += kb;
			for (int j = 0; j < drives.length; j++) {
				pay += drives[j];
				if (pay <= b) {
					if (pay > max)
						max = pay;
					poss = true;
				}

				pay = kb;
			}
			pay = 0;
		}
		if (!poss)
			max = -1;
		return max;
	}
}
