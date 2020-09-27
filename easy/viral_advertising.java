package easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class viral_advertising {

	// Complete the viralAdvertising function below.
	static int viralAdvertising(int n) {
		int init = 5;
		int recep = 0;
		int liked = 0;

		for (int i = 1; i <= n; i++) {
			liked = (int) Math.floor(init / 2);
			recep += liked;
			init = liked * 3;
		}
		return (int) recep;
	}
}