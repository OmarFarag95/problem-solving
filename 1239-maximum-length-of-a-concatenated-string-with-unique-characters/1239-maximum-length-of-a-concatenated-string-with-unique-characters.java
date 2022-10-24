class Solution {

    int max = 0;
    public int maxLength(List < String > arr) {
        helper(arr, "", 0);

        return max;

    }

    public void helper(List < String > arr, String curr, int start) {
        if (curr.length() > max)
            max = curr.length();

        for (int i = start; i < arr.size(); i++) {
            String candidate = arr.get(i);
            HashSet < Character > unique = new HashSet < > ();
            boolean invalid = false;
            for (int j = 0; j < candidate.length(); j++) {
                if (unique.contains(candidate.charAt(j))) {
                    invalid = true;
                    break;
                } else unique.add(candidate.charAt(j));

                if (curr.contains(candidate.charAt(j) + "")) {
                    invalid = true;
                    break;
                }
            }

            if (invalid)
                continue;

            helper(arr, curr + arr.get(i), i + 1);
        }
    }
}