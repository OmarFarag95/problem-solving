package warmup;

import java.util.ArrayList;
import java.util.List;

public class Compare_The_Triplets {

	// Complete the compareTriplets function below.
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		int alice = 0;
		int bob = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i))
				alice++;
			if (a.get(i) < b.get(i))
				bob++;
		}
		nums.add(alice);
		nums.add(bob);
		return nums;
	}

}
