package easy;

public class equalize_the_array {

	// Complete the equalizeArray function below.
	static int equalizeArray(int[] arr) {

		int appear = 0;
		int reptitive = 0;
		int count = 0;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			appear++;
			max = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (max == arr[j])
					appear++;
			}

			if (appear > count) {
				reptitive = max;
				count = appear;
			}
			appear = 0;
		}

		int out = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != reptitive)
				out++;
		}
		return out;
	}
}
