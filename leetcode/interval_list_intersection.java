class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {

        ArrayList < ArrayList < Integer >> intersections = new ArrayList < > ();

        int index = 0;
        for (int i = 0; i < A.length; i++) {
            int x = A[i][0];
            int y = A[i][1];


            for (int j = index; j < B.length; j++) {

                int m = B[j][0];
                int n = B[j][1];
                int left = Math.max(x, m);
                int right = Math.min(y, n);


                if (y < m || x > n) {
                    continue;
                }
                ArrayList < Integer > t = new ArrayList < > ();
                t.add(left);
                t.add(right);
                intersections.add(t);

            }
        }

        int[][] out = new int[intersections.size()][2];

        for (int i = 0; i < out.length; i++)
            out[i] = intersections.get(i).stream().mapToInt(j - > j).toArray();

        return out;
    }
}
