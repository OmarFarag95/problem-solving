class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap < Integer, Integer > map = new HashMap < > ();

        for (int i = 0; i < arr.length; i++)
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);


        HashSet < Integer > unique = new HashSet < > ();
        for (int k: map.keySet()) {
            int value = map.get(k);

            if (unique.contains(value))
                return false;
            unique.add(value);
        }

        return true;

    }
}
