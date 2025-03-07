class Solution {
    /*public String clearDigits(String s) {
        
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> nonIntIndices = new ArrayList<>();
        HashSet<Integer> indicesToRemove = new HashSet<>();

        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
                {
                    indicesToRemove.add(i);
                    if(nonIntIndices.size()>0)
                        {
                            int k = nonIntIndices.get(nonIntIndices.size()-1);
                            nonIntIndices.remove(nonIntIndices.size()-1);
                            indicesToRemove.add(k);
                        }
                }
            else
            {
              nonIntIndices.add(i);  
            }
        }

        for(int i = 0;i<s.length();i++)
        {
            if(indicesToRemove.contains(i))
                continue;
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }*/

    /*public String clearDigits(String s) {
        
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                if(st.size()>0)
                    st.pop();
            }
            else
            {
                st.push(i);
            }
        }

        while(!st.isEmpty())
            sb.append(s.charAt(st.pop()));

        return sb.reverse().toString();
    }*/

    public String clearDigits(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                sb.deleteCharAt(sb.length()-1);
            }
            else
            {
                sb.append(s.charAt(i));   
            }
        }

        return sb.toString();
    }
}