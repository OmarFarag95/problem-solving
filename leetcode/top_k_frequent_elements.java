class Solution {
    public void update_map(HashMap < Integer, List < Integer >> map, int k, int v) {
        List < Integer > vals;

        if (map.containsKey(k))
            vals = map.get(k);
        else
            vals = new ArrayList < Integer > ();

        vals.add(v);
        map.put(k, vals);
    }
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);

        HashMap < Integer, List < Integer >> map = new HashMap < Integer, List < Integer >> ();

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;
            else {
                int c = i - j;
                j = i;

                update_map(map, c, nums[i - 1]);
            }
        }

        int c = nums.length - j;
        update_map(map, c, nums[nums.length - 1]);

        ArrayList < Integer > freqs = new ArrayList < Integer > (map.keySet());

        Collections.sort(freqs);

        int out[] = new int[k];
        int m = 0;
        for (int l = freqs.size() - 1; l > freqs.size() - 1 - k; l--) {
            if (m > out.length - 1)
                break;

            List < Integer > v = map.get(freqs.get(l));
            for (int i = 0; i < v.size(); i++) {
                out[m] = v.get(i);
                m++;
            }
        }
        return out;
    }
}
