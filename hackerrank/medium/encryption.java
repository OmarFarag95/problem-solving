package hackerrank.medium;

public class encryption {

	// Complete the encryption function below.
	static String encryption(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				s = s.substring(0, i) + s.substring(i);
		}
		double length = s.length();
		int rows = (int) Math.floor(Math.sqrt(length));
		int columns = (int) Math.ceil(Math.sqrt(length));

		while (rows * columns < s.length())
			rows++;

		char[][] word = new char[rows][columns];
		String out = "";
		int c = 0;
		int k = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = c; j < s.length() && j < columns + c; j++) {
				word[i][k] = s.charAt(j);
				k++;
			}
			c = c + columns;
			k = 0;
		}

		/*
		 * for(int i=0;i<rows;i++){ for(int j=0;j<columns;j++) {
		 * System.out.print(word[i][j]+" "); } System.out.println(); }
		 */

		for (int j = 0; j < columns; j++) {
			for (int i = 0; i < rows; i++) {

				{
					if (word[i][j] != Character.MIN_VALUE)
						out += word[i][j];
				}
			}
			out += " ";
		}

		return out;
	}
}