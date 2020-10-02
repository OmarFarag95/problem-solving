package hackerrank.easy;

public class acm_icpc_team {

	// Complete the acmTeam function below.
	static int OR(char A, char B) {
		if (A == '0' && B == '0')
			return 0;
		return 1;
	}

	static int[] acmTeam(String[] topic) {

		int max = Integer.MIN_VALUE;

		int teams = 0;

		for (int i = 0; i < topic.length; i++) {
			int c = 0;
			String A = topic[i];
			for (int j = i + 1; j < topic.length; j++) {
				String B = topic[j];

				for (int m = 0; m < A.length(); m++) {
					c += OR(A.charAt(m), B.charAt(m));
				}
				if (c > max) {
					max = c;
					teams = 1;
				} else if (c == max)
					teams += 1;

				c = 0;
			}

		}

		int[] out = { max, teams };
		return out;
	}
}