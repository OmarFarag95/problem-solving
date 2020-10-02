package hackerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class migratory_birds {
	static int migratoryBirds(List<Integer> arr) {
		Collections.sort(arr);
		Set<Integer> store = new HashSet<>();
		HashMap appearances = new HashMap();
		String s = "";
		int appear = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j))
					appear++;
			}
			i = i + appear;

			if (appear > 0) {
				appear++;
				if (!appearances.isEmpty()) {
					if (appearances.get(appear) != null) {
						if (arr.get(i) < (int) appearances.get(appear)) {
							appearances.put(appear, arr.get(i));
						}

					} else
						appearances.put(appear, arr.get(i));
				} else
					appearances.put(appear, arr.get(i));

				appear = 0;
			}
		}

		ArrayList<Integer> data = new ArrayList<Integer>(appearances.keySet());
		Collections.sort(data);

		int out = (int) appearances.get(data.get(data.size() - 1));
		return out;
	}
}
