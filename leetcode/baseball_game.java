class Solution {
    public int calPoints(String[] ops) {
        Stack < Integer > scores = new Stack();

        for (int i = 0; i < ops.length; i++) {
            modify_stack(ops[i], scores);
        }

        int ans = 0;
        for (int score: scores)
            ans += score;
        return ans;
    }


    public Stack modify_stack(String op, Stack < Integer > scores) {
        if (scores.size() >= 2 && op.equals("+")) {
            int n1 = scores.pop();
            int n2 = scores.pop();
            int new_val = n1 + n2;
            scores.push(n2);
            scores.push(n1);
            scores.push(new_val);
        } else if (scores.size() > 0 && op.equals("D")) {
            int n1 = scores.peek();
            scores.push(n1 * 2);
        } else if (scores.size() > 0 && op.equals("C")) {
            scores.pop();
        } else scores.push(Integer.parseInt(op));

        return scores;
    }
}
