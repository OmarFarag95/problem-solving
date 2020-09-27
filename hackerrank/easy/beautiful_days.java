package easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class beautiful_days {

	// Complete the beautifulDays function below.
	static int beautifulDays(int i, int j, int k) {
		int happy = 0;
		for (int m = i; m <= j; m++) {
			int num = m;
			int reverse = 0;
			int check = 0;
			while (num != 0) {
				reverse = reverse * 10 + num % 10;
				num /= 10;
			}
			check = (Math.abs(m - reverse)) % k;
			
			if (check == 0)
				happy++;

		}
		return happy;
	}
}