package easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class jumping_on_clouds_rev {

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c, int k) {
		int out = 100;
		int j = 0;
		boolean b = false;
		if (j + k >= c.length) {
			if (c[j] == 1)
				out -= 3;
			else
				out -= 1;
		} else {
			while (j + k < c.length) {
				j += k;

				if (c[j] == 1)
					out -= 3;
				else
					out -= 1;

				if (j + k >= c.length) {
					j = 0;
					if (c[j] == 1)
						out -= 3;
					else
						out -= 1;
					break;
				}
			}
		}
		return out;
	}
}
