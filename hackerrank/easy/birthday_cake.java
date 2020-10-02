package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Arrays;

public class birthday_cake {

	// Complete the birthdayCakeCandles function below.
	static int birthdayCakeCandles(int[] ar) {
		Arrays.sort(ar);
		int max = ar[ar.length - 1];
		int blown = 0;
		System.out.println(max);
		for (int i = 0; i < ar.length; i++)
			if (ar[i] == max)
				blown++;
		return blown;

	}
}