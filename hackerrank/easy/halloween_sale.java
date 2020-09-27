package easy;

public class halloween_sale {

	// Complete the howManyGames function below.
	static int howManyGames(int p, int d, int m, int s) {
		// Return the number of games you can buy
		int games = 0;
		int paid = p;
		while (paid <= s) {
			games++;

			if (p - d >= m)
				p -= d;
			else
				p = m;
			paid += p;

		}
		return games;
	}
}
