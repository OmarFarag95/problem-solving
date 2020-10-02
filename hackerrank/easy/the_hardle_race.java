package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class the_hardle_race {

	// Complete the hurdleRace function below.
	static int hurdleRace(int k, int[] height) {
		int max = height[0];
		for (int i = 0; i < height.length; i++)
			if (height[i] > max)
				max = height[i];

		if (k > max)
			return 0;
		else
			return max - k;
	}
}