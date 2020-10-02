package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class utopian_tree {

	// Complete the utopianTree function below.
	static int utopianTree(int n) {
		int height = 1;
		if (n == 0)
			return height;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				height++;
			else
				height *= 2;
		}
		return height;
	}
}