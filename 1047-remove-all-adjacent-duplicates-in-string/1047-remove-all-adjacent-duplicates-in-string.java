class Solution {
    public String removeDuplicates(String s) {

        Stack < Character > chars = new Stack < > ();

        for (char c: s.toCharArray()) {
            if (chars.size() > 0 && chars.peek() == c)
                chars.pop();

            else
                chars.push(c);
        }

        StringBuilder sb = new StringBuilder();

        for (char c: chars)
            sb.append(c);

        return sb.toString();
    }
}