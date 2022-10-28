class Solution {

    public List < List < String >> groupAnagrams(String[] strs) {

        String[] sortedStrs = new String[strs.length];
        List < List < String >> output = new ArrayList < List < String >> ();

        HashMap < String, List < String >> map = new HashMap < > ();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            sortedStrs[i] = sorted;
            if (map.containsKey(sorted)) {
                List < String > current = map.get(sorted);
                current.add(strs[i]);
                map.put(sorted, current);
            } else {
                List < String > current = new ArrayList < > ();
                current.add(strs[i]);
                map.put(sorted, current);
            }
        }

        for (String k: map.keySet())
            output.add(map.get(k));

        return output;
    }


}