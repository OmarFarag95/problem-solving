class Solution {
    public int calculate(String s) {
        
        s = s.strip();
        
        int sign = 1; // 1 for positive, -1 for negative
        int output = 0;
        
        int current = 0;
        
        Stack<Integer> nums = new Stack<>();
        
        for(int i=0;i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                current = current * 10 + Character.getNumericValue(s.charAt(i));
                
            }
            else if (s.charAt(i)=='-')
            {
                output = output + current*sign;
                sign = -1;
                current = 0;
            }
            else if (s.charAt(i) == '+')
            {
                output = output + current*sign;
                sign = 1;
                current = 0;
            }
            else if(s.charAt(i) == '(')
            {
                nums.push(output);
                nums.push(sign);
                
                sign = 1;
                output = 0;
            }
            else if (s.charAt(i) == ')')
            {
                output += sign*current;
                output *= nums.pop();
                output += nums.pop();
                current = 0;
            }
                
        }
        
        output += sign * current;
        
        return output;
    }
}