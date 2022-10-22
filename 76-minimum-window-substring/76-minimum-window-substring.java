class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length())
            return "";

        HashMap < Character, Integer > counts = new HashMap < > ();

        for (int i = 0; i < t.length(); i++)
            counts.put(t.charAt(i), counts.getOrDefault(t.charAt(i), 0) + 1);

        //minimum is [i, i+t.length()]

        int l = 0;
        int r = 0;

        HashMap < Character, Integer > curr_counts = new HashMap < > ();

        int length = 0;

        int min_size = Integer.MAX_VALUE;
        int final_l = -1;
        int final_r = -1;

        while (r < s.length() && l <= r) {
            curr_counts.put(s.charAt(r), curr_counts.getOrDefault(s.charAt(r), 0) + 1);

            // .equals here is just fucckkk
            if (curr_counts.get(s.charAt(r)).equals(counts.getOrDefault(s.charAt(r), 0)))
                length += 1;

            // shrink window if match is found
            while (length == counts.size()) {
                if (r - l + 1 < min_size) {
                    min_size = r - l + 1;
                    final_l = l;
                    final_r = r;
                }

                //remove character at current_position l
                curr_counts.put(s.charAt(l), curr_counts.get(s.charAt(l)) - 1);

                if (curr_counts.get(s.charAt(l)) < counts.getOrDefault(s.charAt(l), 0))
                    length -= 1;

                l++;
            }

            r++;
        }

        if (final_l != -1)
            return s.substring(final_l, final_r + 1);

        return "";

    }
}