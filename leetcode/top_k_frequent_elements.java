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


// Another solution

/*class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap < Integer, Integer > freqs = new HashMap < Integer, Integer > ();

        Map < Integer, ArrayList < Integer >> freqs_vs_values = new TreeMap < Integer, ArrayList < Integer >> (Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++)
            freqs.put(nums[i], freqs.getOrDefault(nums[i], 0) + 1);


        for (int i: freqs.keySet()) {
            int v = freqs.get(i);

            if (freqs_vs_values.containsKey(v)) {
                ArrayList < Integer > candidates = freqs_vs_values.get(v);
                candidates.add(i);

                freqs_vs_values.put(v, candidates);
            } else {
                ArrayList < Integer > candidates = new ArrayList < Integer > ();
                candidates.add(i);

                freqs_vs_values.put(v, candidates);
            }
        }

        ArrayList < Integer > output = new ArrayList < Integer > ();

        for (int i: freqs_vs_values.keySet()) {
            ArrayList < Integer > x = freqs_vs_values.get(i);
            for (int j = 0; j < x.size() && output.size() < k; j++)
                output.add(x.get(j));

        }

        return output.stream().mapToInt(i - > i).toArray();

    }
}*/
