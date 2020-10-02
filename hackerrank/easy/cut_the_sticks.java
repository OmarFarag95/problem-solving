package hackerrank.easy;

import java.util.ArrayList;
import java.util.Arrays;

public class cut_the_sticks {
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	// Complete the cutTheSticks function below.
	static int[] cutTheSticks(int[] arr) {
		ArrayList<Integer> store = new ArrayList<Integer>();

		int c = 0;
		int zeros = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				zeros++;
		}
		store.add(arr.length - zeros);

		int min = 0;
		for (int i = 0; i < arr.length; i++) {
			min = arr[i];
			printArr(arr);
			System.out.println();
			for (int j = i; j < arr.length; j++) {
				if (arr[j] > 0) {
					arr[j] = arr[j] - min;
					c++;
				}
			}
			if (c != 0 && store.contains(c) == false)
				store.add(c);
			c = 0;
		}
		System.out.println(store);
		int[] out = new int[store.size()];
		for (int i = 0; i < out.length; i++)
			out[i] = store.get(i);
		return out;
	}
}
