package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class greedy_floroist {

	static HashMap<Integer, ArrayList<Integer>> person_flowers = new HashMap<Integer, ArrayList<Integer>>();

	static void update_map(int key, int value) {
		ArrayList<Integer> flowers = person_flowers.get(key);
		flowers.add(value);
		person_flowers.put(key, flowers);
	}

	static int getMinimumCost(int k, int[] c) {
		Arrays.sort(c);

		List<Integer> flowers = new ArrayList<Integer>();

		int cost = 0;
		int n = c.length;

		if (n <= k) // each one will buy one flower at most
		{
			for (int i = 0; i < n; i++)
				cost += c[i];
			return cost;
		}

		for (int i = 1; i <= k; i++) {
			ArrayList<Integer> initial = new ArrayList<Integer>();

			person_flowers.put(i, initial);
		}

		int reminder = n % k;
		// minimum number of flowers for each person
		int min_person = (n - reminder) / k;
		int grp = k - reminder;
		int index = n - 1;
		int key = 1;
		while (index >= 0) {
			if (key > k)
				key = 1;

			// update hash map
			update_map(key, c[index]);

			int value_per_person = person_flowers.get(key).size();

			if (key == k && value_per_person == min_person)
				break;

			index--;
			key++;

		}

		index--;
		key = grp + 1;

		while (index >= 0) {
			if (key > k)
				key = grp + 1;

			update_map(key, c[index]);

			index--;
			key++;

		}
		for (int person : person_flowers.keySet()) {
			int purchases = 0;
			ArrayList<Integer> f = person_flowers.get(person);
			for (int j = 0; j < f.size(); j++) {
				cost += (purchases + 1) * f.get(j);
				purchases++;
			}

		}

		return cost;
	}
}
