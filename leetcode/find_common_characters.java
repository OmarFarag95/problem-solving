class Solution {
    public List < String > commonChars(String[] A) {
        HashSet < Character > commonChars = new HashSet < > ();
        HashMap < Character, Integer > map = new HashMap < > ();

        HashSet < Character > curr = new HashSet < > ();
        for (int j = 0; j < A[0].length(); j++)
            curr.add(A[0].charAt(j));
        commonChars.addAll(curr);

        for (int i = 1; i < A.length; i++) {
            curr = new HashSet < > ();
            for (int j = 0; j < A[i].length(); j++) {
                curr.add(A[i].charAt(j));
            }

            commonChars.retainAll(curr);


        }

        for (char c: commonChars) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < A.length; i++) {
                int cr = 0;
                for (int j = 0; j < A[i].length(); j++) {
                    if (c == A[i].charAt(j))
                        cr += 1;
                }
                if (cr < min)
                    min = cr;
            }
            map.put(c, min);
        }

        List < String > out = new ArrayList < > ();
        for (char c: map.keySet()) {
            int count = map.get(c);
            int i = 0;
            while (i < count) {
                out.add("" + c);
                i++;
            }
        }

        return out;
    }
}
