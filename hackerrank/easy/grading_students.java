package hackerrank.easy;

public class grading_students {
	static int[] gradingStudents(int[] grades) {
		int[] out = new int[grades.length];
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38)
				out[i] = grades[i];
			else if (grades[i] % 5 == 0)
				out[i] = grades[i];
			else {
				int temp = grades[i];
				while (temp % 5 != 0) {
					temp++;
				}
				if (temp - grades[i] < 3) {
					out[i] = temp;
				} else
					out[i] = grades[i];
			}
		}
		return out;
	}

}
