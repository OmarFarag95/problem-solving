
public class Solution {
    public String simplifyPath(String path) {
        // Split the path by slashes
        String[] parts = path.split("/");
        // Use a stack to store the valid directories
        Stack<String> stack = new Stack<>();
        // Iterate over the parts
        for (String part : parts) {
            // If the part is empty or a single dot, ignore it
            if (part.isEmpty() || part.equals(".")) {
                continue;
            }
            // If the part is a double dot, pop the top element from the stack if not empty
            if (part.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Otherwise, push the part to the stack
                stack.push(part);
            }
        }
        // If the stack is empty, return a single slash
        if (stack.isEmpty()) {
            return "/";
        }
        // Otherwise, build the canonical path from the stack elements
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }
        return sb.toString();
    }
}