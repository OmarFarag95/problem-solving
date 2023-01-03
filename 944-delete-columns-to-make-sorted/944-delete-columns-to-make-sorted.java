class Solution {
    public int minDeletionSize(String[] strs) {

        HashMap < Integer, Character > map = new HashMap < > ();

        HashSet < Integer > columns = new HashSet < > ();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];

            int k = 0;
            for (int j = 0; j < word.length(); j++) {

                if (!map.containsKey(k))
                    map.put(k, word.charAt(k));
                else {
                    if (word.charAt(k) < map.get(k) && !columns.contains(k))
                        columns.add(k);
                    else
                        map.put(k, word.charAt(k));
                }
                k++;
            }

        }

        return columns.size();
    }
}