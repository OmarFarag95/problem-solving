package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class diagonal_difference {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] arr) {
		int prim = 0;
		int sec = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j)
					prim += arr[i][j];
				if (i + j == arr[i].length - 1)
					sec += arr[i][j];
			}
		}
		return Math.abs(prim - sec);
	}
}