package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class picking_numbers {

	/*
	 * Complete the 'pickingNumbers' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static int pickingNumbers(List<Integer> a) {
		// Write your code here

		Collections.sort(a);
		ArrayList<Integer> store = new ArrayList<Integer>();
		int c = 0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = i + 1; j < a.size(); j++) {
				if (a.get(j) - a.get(i) == 0)
					c++;
			}
			store.add(a.get(i));
			i = i + c;
			c = 0;
		}
		int max = 0;
		for (int i = 0; i < store.size(); i++) {
			for (int m = 0; m < a.size(); m++) {
				if (a.get(m) >= store.get(i))
					if (a.get(m) - store.get(i) <= 1)
						c++;
			}
			if (max < c)
				max = c;
			c = 0;
		}

		return max;
	}
}
