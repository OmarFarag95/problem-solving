package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class jim_and_the_orders {

	// Complete the jimOrders function below.
	static int[] jimOrders(int[][] orders) {

		HashMap<Integer, ArrayList<Integer>> serve_times = new HashMap<Integer, ArrayList<Integer>>();

		for (int i = 0; i < orders.length; i++) {
			int serve_time = orders[i][0] + orders[i][1];

			if (serve_times.containsKey(serve_time)) {
				ArrayList<Integer> orders_li = serve_times.get(serve_time);
				orders_li.add(i + 1);
				serve_times.put(serve_time, orders_li);
			} else {
				ArrayList<Integer> orders_li = new ArrayList<Integer>();
				orders_li.add(i + 1);
				serve_times.put(serve_time, orders_li);
			}

		}

		int[] out = new int[orders.length];
		int arr_index = 0;

		Object[] keys = serve_times.keySet().toArray();
		Arrays.sort(keys);

		for (Object i : keys) {
			ArrayList<Integer> orders_li = serve_times.get((int) i);

			for (int j = 0; j < orders_li.size(); j++) {

				out[arr_index] = orders_li.get(j);
				arr_index++;
			}
		}

		System.out.println(serve_times);
		return out;

	}
}
