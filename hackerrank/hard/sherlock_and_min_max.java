package hackerrank.hard;

import java.util.Arrays;

public class sherlock_and_min_max {

	// Complete the sherlockAndMinimax function below.

	// search for the number itself if exists or get nearest element
	/*
	 * static int nearest_diff(int [] arr,int l, int r, int x) { int index=0;
	 * while(l<=r) { int mid = (l+r)/2;
	 * 
	 * if(arr[mid]==x) return mid; if(arr[mid]<x) { l=mid+1; index=l; } else {
	 * r=mid-1; index=r; }
	 * 
	 * } if(index<0) index =0; return index; } static int sherlockAndMinimax(int[]
	 * arr, int p, int q) {
	 * 
	 * Arrays.sort(arr);
	 * 
	 * HashMap<Integer, Integer> val_diff = new HashMap<Integer, Integer>(); int val
	 * = 0; int global_max = Integer.MIN_VALUE;
	 * 
	 * int l=0; int r=arr.length-1; while (p <= q) { int index =
	 * nearest_diff(arr,l,r,p);
	 * 
	 * int local_min = 0; int min = 0;
	 * 
	 * int v1 = Integer.MAX_VALUE; int v2 = Integer.MAX_VALUE; int v3 =
	 * Integer.MAX_VALUE;
	 * 
	 * if (index - 1 >= 0) v1 = p - arr[index - 1];
	 * 
	 * if (v1 < 0) v1 = -1 * v1;
	 * 
	 * if (index + 1 <= arr.length - 1) v2 = p - arr[index + 1];
	 * 
	 * if (v2 < 0) v2 = -1 * v2;
	 * 
	 * if (index >= 0 && index <= arr.length - 1) v3 = p - arr[index];
	 * 
	 * if (v3 < 0) v3 = -1 * v3;
	 * 
	 * if (v1 < v2) min = v1; else min = v2;
	 * 
	 * if (min < v3) local_min = min; else local_min = v3;
	 * 
	 * if (local_min > global_max) { global_max = local_min; val = p; }
	 * 
	 * p++; }
	 * 
	 * return val; }
	 */

	static int sherlockAndMinimax(int[] arr, int p, int q) {
		Arrays.sort(arr);
		int max = Integer.MIN_VALUE;
		int diff = Integer.MIN_VALUE;

		if (arr[0] > p) {
			diff = arr[0] - p;
			max = p;

		}
		if (arr[arr.length - 1] < q) {

			diff = q - arr[arr.length - 1];
			max = q;

		}
		for (int i = 0; i < arr.length - 1; i++) {
			int m = (arr[i + 1] + arr[i]) / 2;

			if (m >= p && m <= q) {
				if (m - arr[i] > diff) {
					diff = m - arr[i];
					max = m;
				}
			} else if (m > q) {
				if (q - arr[i] > diff) {
					diff = q - arr[i];
					max = q;
				}
			} else {
				if (arr[i + 1] - p > diff) {
					diff = arr[i + 1] - p;
					max = p;
				}
			}
		}
		return max;
	}
}