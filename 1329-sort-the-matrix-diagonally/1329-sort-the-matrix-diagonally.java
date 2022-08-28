class Solution {
    public int[][] diagonalSort(int[][] mat) {
        
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				int diff = i - j;

				ArrayList<Integer> values = map.getOrDefault(diff, new ArrayList<Integer>());
				values.add(mat[i][j]);
				map.put(diff, values);

			}

		}

		for (int k : map.keySet()) {
			ArrayList<Integer> values = map.get(k);
			Collections.sort(values);
			map.put(k, values);
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {

				int diff = i - j;

				ArrayList<Integer> values = map.get(diff);

				mat[i][j] = values.get(0);
				values.remove(0);

				map.put(diff, values);

			}
		}
		return mat;
        
    }
}