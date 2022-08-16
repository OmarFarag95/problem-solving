class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> nums = new Stack<>();
        
        for(int i=0;i<tokens.length;i++)
        {
            if(!tokens[i].equals("*") && !tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("/"))
            {
                nums.push(Integer.parseInt(tokens[i]));
            }
            
            else
            {
                int b = nums.pop();
                int a = nums.pop();
                
                int result = eval(a, b, tokens[i]);
                
                
                nums.push(result);
            }
            
        }
        
        return nums.peek();
        
    }
    
    
    public int eval(int a, int b, String operator)
    {
        if(operator.equals("*"))
            return a*b;
        else if(operator.equals("+"))
            return a+b;
        else if(operator.equals("-"))
            return a-b;
        else
            return a/b;
        
    }
}