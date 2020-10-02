package hackerrank.easy;

import java.util.List;

public class bon_appetit {
	static void bonAppetit(List<Integer> bill, int k, int b) {
		int actual = 0;
		for (int i = 0; i < bill.size(); i++) {
			if (i != k) {
				actual += bill.get(i);
			}
		}
		actual /= 2;
		if (b == actual)
			System.out.println("Bon Appetit");
		else
			System.out.println(b - actual);
	}
}
