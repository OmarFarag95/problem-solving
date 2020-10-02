package hackerrank.easy;

public class kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
		if (x1 > x2 && v1 > v2)
			return "NO";
		else if (x2 > x1 && v2 > v1)
			return "NO";
		else if (x1 == x2 && (v1 > v2 || v2 > v1))
			return "NO";
		else if (v1 == v2 && (x1 > x2 || x2 > x1))
			return "NO";
		int i = 1;
		while (i <= 10000) {
			if (x1 + v1 == x2 + v2)
				return "YES";
			x1 = x1 + v1;
			x2 = x2 + v2;
			i = i + 1;
		}
		return "NO";
	}
}
