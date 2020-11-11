package leetcode;

import java.util.Stack;

class remove_outermost_parentheses {
    public String removeOuterParentheses(String S) {
        if(S.length()==0)
            return "";
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        
        int start = 0;
        int end = 0;
        for(int i=0;i<S.length();i++)
        {
            if(S.charAt(i)=='(')
                st.add(i);
            
            else 
            {
                int x = st.pop();
                int diff = i-x;
                if(diff>1 &&st.size()<1) //means that '(' and ')' are not adjacent, st.size()<1 to take largest range
                {
                    start = x;
                    end = i;
                    sb.append(S.substring(start+1,end));
                }
            }
            
        }                          
        
        if(sb.length()==0)
            return "";
        return new String(sb);
    }
}