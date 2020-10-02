package hackerrank.easy;

import java.util.Arrays;

public class between_two_sets {
	
	static int getTotalX(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int count = 0;
		boolean divis = false;
		boolean fac = false;
		for (int i = a[a.length - 1]; i <= b[0]; i++) { // System.out.println(i);
			for (int j = 0; j < a.length; j++) {
				if (i % a[j] == 0)
					divis = true;
				else {
					divis = false;
					break;
				}

			}
			if (divis) {

				for (int k = 0; k < b.length; k++) {
					if (b[k] % i == 0)
						fac = true;
					else {
						fac = false;
						break;
					}
				}
				if (fac) {
					count++;
					System.out.println("correct " + i);
				}
				divis = false;
				fac = false;
			}
		}
		return count;
	}

}
