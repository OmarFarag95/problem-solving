package hackerrank.easy;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class designer_pdf_viewer {

	// Complete the designerPdfViewer function below.
	static int designerPdfViewer(int[] h, String word) {
		// not my sol, but kept it for the (char - char) tick
		/*
		 * char s[] = word.toCharArray(); int maximum=0; for (char x:s) {
		 * maximum=Math.max(maximum,h[(int)(x-'a')]); } int out=maximum*word.length();
		 * 
		 * return out;
		 */
		char c[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
				'u', 'v', 'w', 'x', 'y', 'z' };
		Map<Character, Integer> mymap = new HashMap<Character, Integer>();
		for (int i = 0; i < c.length; i++) {
			mymap.put(c[i], h[i]);
		}
		int[] arr = new int[word.length()];
		for (int i = 0; i < word.length(); i++) {
			if (mymap.containsKey(word.charAt(i))) {
				arr[i] = mymap.get(word.charAt(i));
				System.out.println(arr[i]);
			}

		}
		Arrays.sort(arr);

		return arr[arr.length - 1] * word.length();

	}
}
