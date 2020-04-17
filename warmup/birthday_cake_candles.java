package warmup;

import java.util.Arrays;

public class birthday_cake_candles {
	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int max = ar[ar.length - 1];
		int blown = 0;
		for (int i = 0; i < ar.length; i++)
			if (ar[i] == max)
				blown++;
		return blown;
	}

}
