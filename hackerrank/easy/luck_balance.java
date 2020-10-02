package hackerrank.easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class luck_balance {

	// Complete the luckBalance function below.
	static int luckBalance(int k, int[][] contests) {

		List<Integer> contst = new ArrayList<Integer>();
		int imp = 0;
		int val = 0;
		for (int i = 0; i < contests.length; i++) {
			if (contests[i][1] == 1) {
				imp++;
				contst.add(contests[i][0]);
			}
			val += contests[i][0];

		}

		Collections.sort(contst);
		int ded = 0;
		int i = 0;
		while (imp > k) {
			ded += contst.get(i);
			imp--;
			i++;
		}

		return val - ded * 2;

	}
}