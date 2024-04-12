class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList();
        for (int[] in : intervals) {
            // insert all subsequent  intervals (no overlap)
            if (in[1] < newInterval[0]) {
                list.add(in);
            } // if interval will fit between all existing intervals
            else if (in[0] > newInterval[1]) {
                list.add(newInterval);
                newInterval = in;
            }
            // in case of intersection, take the union
            else 
            {
                newInterval[0] = Math.min(newInterval[0], in[0]);
                newInterval[1] = Math.max(newInterval[1], in[1]);
            }
        }
        list.add(newInterval);

        return list.toArray(new int[list.size()][]);
    }
}